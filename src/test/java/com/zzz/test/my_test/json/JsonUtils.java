package com.zzz.test.my_test.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zzz.tools.file.FileUtils;

public class JsonUtils {
    private JsonUtils(){}

    public static void main(String[] args) throws Exception {
        String s = FileUtils.readFile("D:\\IDEA DEV\\my-test\\src\\test\\java\\com\\zzz\\test\\my_test\\json\\temp.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);

        JsonNode jsonNode = objectMapper.readTree(s);
        ArrayNode arrayNode = objectMapper.createArrayNode();
        jsonNode.forEach(innerJsonNode ->{
            ObjectNode objectNode = objectMapper.createObjectNode();
            JsonNode name = innerJsonNode.get("name");
            JsonNode ar = innerJsonNode.get("ar");
            JsonNode al = innerJsonNode.get("al");
            JsonNode tns = innerJsonNode.get("tns");
            objectNode.set("name",name);
            objectNode.set("ar",ar);
            objectNode.set("al",al);
            objectNode.set("tns",tns);
            arrayNode.add(objectNode);

        });

        System.out.println(arrayNode.toPrettyString());

    }
}
