package com.zzz.test.my_test.exam.指定题库考试;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.zzz.tools.file.FileUtils;
import okhttp3.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class ApiCaller {
    private static final Logger logger = LoggerFactory.getLogger(ApiCaller.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private static Long START_TIME_STAMP = new Date().getTime();

    public static void main(String[] args) {
//        try {
//            int spendTime = getSpendTime();
//
//            ObjectNode requestBody = 解析json(发起考试通过json(), spendTime);
//
////            Thread.sleep(spendTime);
//            assert requestBody != null;
//
//            System.out.println(考试请求(requestBody));
//        } catch (Exception e) {
//            logger.error("执行考试请求时出现异常", e);
//        }

        System.out.println(解析json(Objects.requireNonNull(FileUtils.readFile("E:\\dev\\my-test\\src\\test\\java\\com\\zzz\\test\\my_test\\exam\\指定题库考试\\模拟考试用题库.json", "utf-8")).toString(),0));
    }

    public static String getUserId() {
        return "2020060303595035995";
    }

    private static String getToken() {
        return "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIwMDYwMzAzNTk1MDM1OTk1IiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNzI3NTI4MDM4fQ.z4tQQ214iO1H3LaFbCk6xcFrgO6XnKxdo8z2tK7ZCWc".trim();
    }

    public static String 发起考试() throws Exception {
        JsonNode requestBody = getTestRequestBody();
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        RequestBody body = RequestBody.create(mediaType, Objects.requireNonNull(requestBody).asText());
        Request request = buildRequest("http://api.edu.sjysz.com/api/exam/auth/practice/start", "POST", body);

        try {
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body()).string();
        } catch (IOException e) {
            logger.error("发起考试 API 请求时出现异常", e);
            throw new Exception("API 返回没有数据", e);
        }
    }
    public static String 发起考试通过json() throws Exception {
        return Objects.requireNonNull(FileUtils.readFile("E:\\dev\\my-test\\src\\test\\java\\com\\zzz\\test\\my_test\\exam\\指定题库考试\\模拟考试用题库.json", "utf-8")).toString();
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


                answerNode.set(answerId, question.get("answer"));
            });

            return rootNode;
        } catch (IOException e) {
            logger.error("解析 JSON 数据时出现异常", e);
        }
        return null;
    }

    public static String 考试请求(JsonNode jsonNode) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        RequestBody body = RequestBody.create(mediaType, "{\"time\":812,\"type\":\"1\",\"id\":\"1655447491883069442\",\"v\":1724946885375,\"userNo\":\"2020060303595035995\",\"userExtNo\":\"2020060303595035995\",\"answer\":{1721765170025361690:[1],1721765170050527480:[1],1721765170025361535:[1],1721765170025361685:[3],1721765170021167473:[2],1721765170054722027:[2],1721765170021167498:[2],1721765170029555832:[2],1721765170058915875:[4],1721765170029556123:[4],1721765170058916212:[1],1721765170029555760:[2],1721765170021167311:[3],1721765170025361645:[2],1721765170050527253:[1],1721765170054721874:[1],1721765170058915915:[1],1721765170021167493:[3],1721765170029555721:[3],1721765170058915946:[4],1721765170025361803:[2],1721765170058916162:[2],1721765170058916179:[1],1721765170058916053:[3],1721765170029556256:[4],1721765170029555975:[2],1721765170025361823:[3],1721765170025361881:[2],1721765170029555988:[4],1721765170021167287:[1],1721765170050527748:[2,3],1721765170037944362:[1,2],1721765170033750141:[1,3],1721765170050527639:[1,2,3,4],1721765170033750562:[1,2,3,4],1721765170033750049:[1,2,3,4,5],1721765170050527594:[1,2],1721765170033750101:[1,2],1721765170033750066:[1,2],1721765170033750044:[2,3],1721765170033750156:[1,4],1721765170033750136:[1,2,3],1721765170029556286:[3,4],1721765170050527723:[2,3],1721765170054721628:[1,2,3,4],1721765170050527679:[3,4],1721765170037944388:[1,2,3,4],1721765170037944619:[1,2,4],1721765170029556291:[1,2,3],1721765170033750206:[1,2,3,4],1721765170042138698:[1],1721765170042138701:[2],1721765170054721676:[1],1721765170054722016:[2],1721765170046332950:[1],1721765170058916081:[2],1721765170058916063:[2],1721765170054721963:[1],1721765170042138704:[1],1721765170042138629:[2],1721765170054722064:[2],1721765170046333268:[2],1721765170046333163:[2],1721765170046333157:[1],1721765170042138815:[1],1721765170046333070:[1],1721765170046333136:[2],1721765170042138851:[2],1721765170046332974:[2],1721765170042138941:[1],1721765170021167207:[1,2,3,4],1721765170016972892:[1,2,3,4]}}");
        Request request = buildRequest("http://api.edu.sjysz.com/api/exam/auth/test/audit", "POST", body);

        try {
            Response response = client.newCall(request).execute();
            return Objects.requireNonNull(response.body()).string();
        } catch (IOException e) {
            logger.error("考试请求 API 调用时出现异常", e);
            throw new Exception("API 没有返回数据", e);
        }
    }

    public static JsonNode getTestRequestBody() {
        try {
            ObjectNode rootNode = OBJECT_MAPPER.createObjectNode();
            rootNode.put("type", "1");
            rootNode.put("lv", 1);
            rootNode.put("id", 1);
            rootNode.put("status", 1);
            rootNode.put("page", 1);
            rootNode.put("v", START_TIME_STAMP);
            rootNode.put("userNo", getUserId());
            rootNode.put("userExtNo", getUserId());
            rootNode.set("testIds", OBJECT_MAPPER.createArrayNode());
            return rootNode;
        } catch (Exception e) {
            logger.error("创建 JSON 请求体时出现异常", e);
        }
        return null;
    }

    public static Request buildRequest(String url, String method, RequestBody body) {
        return new Request.Builder()
                .url(url)
                .method(method, body)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("Accept-Language", "en,zh-CN;q=0.9,zh;q=0.8")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("Origin", "http://app.edu.sjysz.com")
                .addHeader("Referer", "http://app.edu.sjysz.com/")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36")
                .addHeader("token", getToken())
                .build();
    }

    public static int getSpendTime() {
        Random random = new Random();
        int minValue = 10 * 60 * 1000 + 1;
        int maxValue = 15 * 60 * 1000 - 1;
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }
}

 class MyObject {
    private Long propertyName;

    //  getter 和 setter 方法
    public Long getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(Long propertyName) {
        this.propertyName = propertyName;
    }
}