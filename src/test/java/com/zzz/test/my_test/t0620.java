package com.zzz.test.my_test;

import com.zzz.tools.string.StringUtils;
import okhttp3.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static com.zzz.test.my_test.QuestionParser.parseQuestions;

public class t0620 {

    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 50; i++) {
            Thread.sleep(1000);
            String a = parseQuestions(a(i));
            if(StringUtils.isEmpty(a)){
                continue;
            }
            FileUtils.writeStringToFile(new File("D:\\test.txt"),a,  true );
        }
    }
    public static String a(int page) throws Exception {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Date date = new Date();
        MediaType mediaType = MediaType.parse("application/json;charset=UTF-8");
        RequestBody body = RequestBody.create(mediaType, "{\"testIds\":[],\"type\":7,\"questionType\":1,\"categoryId\":\"1253246968562454529\",\"page\":" + page + ",\"stus\":\"0\",\"v\":" + date.getTime() + ",\"userNo\":\"2022022309501471622\",\"userExtNo\":\"2022022309501471622\"}");
        Request request = new Request.Builder()
                .url("http://api.edu.sjysz.com/api/exam/auth/order/orderTest")
                .method("POST", body)
                .addHeader("Accept", "application/json, text/plain, */*")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/json;charset=UTF-8")
                .addHeader("Origin", "http://app.edu.sjysz.com")
                .addHeader("Referer", "http://app.edu.sjysz.com/")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36 Edg/137.0.0.0")
                .addHeader("token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTm8iOiIyMDIyMDIyMzA5NTAxNDcxNjIyIiwiaXNzIjoiUk9OQ09PIiwiZXhwIjoxNzUzMDE1MDUxfQ.CqWs6x7gZJZRBqEeZGePwg-ZyfWiDOBvGUQAasqYs9g")
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
}
