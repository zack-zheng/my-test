package com.zzz.test.my_test.exam.指定题库考试;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zzz.tools.file.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Objects;

import static com.zzz.test.my_test.exam.指定题库考试.AuditUtils.getSpendTime;
import static com.zzz.test.my_test.exam.指定题库考试.AuditUtils.正确率;

public class 组装模拟考试审计请求body {
    private static final Logger logger = LoggerFactory.getLogger(ApiCaller.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static Long START_TIME_STAMP = new Date().getTime();

    public static void main(String[] args) {

        System.out.println(解析json(Objects.requireNonNull(FileUtils.readFile("D:\\IDEA DEV\\my-test\\src\\test\\java\\com\\zzz\\test\\my_test\\exam\\指定题库考试\\模拟考试用题库.json", "utf-8")).toString(),getSpendTime()));

    }

    public static String getUserId() {
        return "2023020218183270099";
    }


    public static ObjectNode 解析json(String json, int spendTime) {
        try {
            ObjectNode rootNode = OBJECT_MAPPER.createObjectNode();
            rootNode.put("time", spendTime / 1000 + 1);
            rootNode.put("type", "1");

            JsonNode jsonNode = OBJECT_MAPPER.readTree(json);
            JsonNode data = jsonNode.get("data");
            JsonNode questions = data.get("questions");
            JsonNode requestId = data.get("id");

            rootNode.put("id", requestId);
            rootNode.put("v", START_TIME_STAMP + spendTime);
            rootNode.put("userNo", getUserId());
            rootNode.put("userExtNo", getUserId());

            ObjectNode answerNode = rootNode.putObject("answer");
            questions.forEach(question -> {
                String answerId = question.get("id").asText();
                if (正确率()){
                    answerNode.set(answerId, question.get("answer"));
                }else {
                    ArrayNode arrayNode = OBJECT_MAPPER.createArrayNode();
                    arrayNode.add(1);
                    answerNode.set(answerId, arrayNode);
                }
            });

            return rootNode;
        } catch (IOException e) {
            logger.error("解析 JSON 数据时出现异常", e);
        }
        return null;
    }

}
