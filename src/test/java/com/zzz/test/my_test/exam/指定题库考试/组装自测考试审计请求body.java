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

public class 组装自测考试审计请求body {

    private static final Logger logger = LoggerFactory.getLogger(ApiCaller.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static Long START_TIME_STAMP = new Date().getTime();

    public static void main(String[] args) {
        //用户token userid 还有type可能要改

        System.out.println(解析json(Objects.requireNonNull(FileUtils.readFile("D:\\IDEA DEV\\my-test\\src\\test\\java\\com\\zzz\\test\\my_test\\exam\\指定题库考试\\自测考试用题库.json", "utf-8")).toString(),getSpendTime()));
    }

    public static String getUserId() {
        return "2020060303595057071";
    }


    public static ObjectNode 解析json(String json, int spendTime) {
        try {

            //{"time":53,"type":5,"answer":{"1721765170025361665":[1]},"selfAssesId":"1654687384849117186","quizId":"1654687384849117186","v":1725197228514,"userNo":"2022022309501471622","userExtNo":"2022022309501471622"}
            ObjectNode rootNode = OBJECT_MAPPER.createObjectNode();
            rootNode.put("time", spendTime / 1000 + 1);
            rootNode.put("type", "5");

            JsonNode jsonNode = OBJECT_MAPPER.readTree(json);
            JsonNode data = jsonNode.get("data");
            JsonNode questions = data.get("questions");
            JsonNode requestId = data.get("id");

            rootNode.put("selfAssesId", requestId);
            rootNode.put("quizId", requestId);
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
                    arrayNode.add("1");
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
