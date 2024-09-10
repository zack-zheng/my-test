package com.zzz.test.my_test.exam;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzz.tools.file.FileUtils;
import okhttp3.*;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ExamSimulator {
    private static String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIzMDIwMjE4MTgzMjcwMDk5IiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNzI4MTM0ODYxfQ.Z-iaLmcMMPj4qtnvYM1s9N8He19UXOh0pE-afgEc0wQ\n";
    private static String userId = "";

    //正确率
    private static int rightP = 90;

    public static void main(String[] args) throws Exception {
        //杨丽纯
        token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIzMDIwMjE4MTgzMjcwMDk5IiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNzI4MTM0ODYxfQ.Z-iaLmcMMPj4qtnvYM1s9N8He19UXOh0pE-afgEc0wQ\n";
        userId = "2023020218183270099";
        考试();

        //
//        token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIyMDIyMzA5NTAxNDcxNjIyIiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNzE5OTYzMjM1fQ.2c164zvvbAgcCKq551O2yPGP0-fZ2yXKU3aPp3IGxPQ\n";
//        userId = "2022022309501471622";
//
//        考试();
        //
//        token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIyMDIyMzA5NTAxNDcxNjIyIiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNzAzNjc4MjAxfQ.pbAF4KTIhfqGBAr5WloIqre6bQbSEMGAUDqxIGoaulQ";
//        userId = "2022022309501471622";
//        考试();


    }

    private static void 考试() throws IOException {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        String bodyString = getJson();
        System.out.println(bodyString);
        RequestBody body = RequestBody.create(mediaType,bodyString);
        Request request = new Request.Builder()
                .url("http://api.edu.sjysz.com/api/exam/auth/test/audit")
                .method("POST", body)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("Origin", "http://app.edu.sjysz.com")
                .addHeader("Referer", "http://app.edu.sjysz.com/")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")
                .addHeader("token", token.trim())
                .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.toString());
    }

    @Test
    public void test_2() {
        System.out.println(365 * 15 / 60);

    }

    private static String getJson() {
        String json = FileUtils.readFile("E:\\dev\\my-test\\src\\test\\java\\com\\zzz\\test\\my_test\\exam\\法律法规题库.txt", "utf-8").toString();
        AuditRequest dto = new AuditRequest();
        JSONArray jsonArray = JSONArray.parseArray(json);
        dto.setTime(jsonArray.size() * 15);
        dto.setType("2");
        dto.setUserNo(userId);
        dto.setUserExtNo(userId);
        dto.setV(new Date().getTime());

        Map<String, List<Integer>> answer = new HashMap<>();
        Random random = new Random();

        jsonArray.forEach(a -> {
            JSONObject object = (JSONObject) a;
            JSONArray answerList = (JSONArray) object.get("answer");
            List<Integer> list = new ArrayList<>();

            int randomNumber = random.nextInt(100) + 1;
            //随机跳过
//            if (randomNumber > 40 && randomNumber < 100) {
//                return;
//            }
            //随机错误
            if (randomNumber > rightP && randomNumber < 100) {
                list.add(random.nextInt(3) + 1);
            } else {
                answerList.forEach(h -> {
                    list.add(Integer.parseInt(h.toString()));
                });
            }
            answer.put(object.get("id").toString(), list);

        });
        Map<String, List<Integer>> answer1 = new HashMap<>();
        int randomNumber = random.nextInt(100) + 200;
        int countInner = 0;
        for (Map.Entry<String, List<Integer>> entry : answer.entrySet()){
            answer1.put(entry.getKey(),entry.getValue());
            countInner ++;
            if (countInner>randomNumber){
                break;
            }
        }



        dto.setAnswer(answer1);
        return JSONObject.toJSONString(dto);
    }


    @Test
    public void test_获取题库文本() throws Exception {
        List<RandomTestResponse.DataBean> allDataBean = new ArrayList<>();

        for (int i = 0; i <= 50; i++) {
            String responseString = 获取题库请求(i);
            RandomTestResponse randomTestResponse = JSONObject.parseObject(responseString, RandomTestResponse.class);
            allDataBean.addAll(randomTestResponse.getData());
            Thread.sleep(100);
            System.out.println(String.format("第%s次请求", i));
        }

        List<RandomTestResponse.DataBean> distinctList = allDataBean.stream()
                .distinct()
                .collect(Collectors.toList());
        Set<String> ids = new HashSet<>();
        distinctList.forEach(dataBean -> {
            ids.add(dataBean.getId());
        });
        System.out.println(ids.size());
        FileUtils.writeFile(ExamSimulator.class.getResource("").getPath().substring(1) + "法律法规题库.txt", JSONObject.toJSONString(distinctList), false);
    }

    public static String 获取题库请求(int page) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        RandomTestRequest randomTestRequest = JSONObject.parseObject("{\"testIds\":[],\"type\":2,\"questionType\":1,\"categoryId\":\"1253246968562454529\",\"page\":1,\"v\":1701086571894,\"userNo\":\"2022022309501471622\",\"userExtNo\":\"2022022309501471622\"}", RandomTestRequest.class);
        randomTestRequest.setV(new Date().getTime());
        randomTestRequest.setUserExtNo(userId);
        randomTestRequest.setUserNo(userId);
        randomTestRequest.setPage(page);
        RequestBody body = RequestBody.create(mediaType, JSONObject.toJSONString(randomTestRequest));
        Request request = new Request.Builder()
                .url("http://api.edu.sjysz.com/api/exam/auth/test/randomTest")
                .method("POST", body)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("Origin", "http://app.edu.sjysz.com")
                .addHeader("Proxy-Connection", "keep-alive")
                .addHeader("Referer", "http://app.edu.sjysz.com/")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.0.0 Safari/537.36")
                .addHeader("token", token)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}