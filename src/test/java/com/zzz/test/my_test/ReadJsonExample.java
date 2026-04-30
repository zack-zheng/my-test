package com.zzz.test.my_test;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJsonExample {
    public static void main(String[] args) {
        // 文件路径
        String filePath = "src/test/java/com/zzz/test/my_test/Sample.json";

        try {
            // 读取文件内容
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // 解析JSON
            JSONArray jsonArray = new JSONArray(content);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                JSONObject data = jsonObject.getJSONObject("data");
                JSONArray list = data.getJSONArray("list");

                // 遍历list
                for (int j = 0; j < list.length(); j++) {
                    JSONObject house = list.getJSONObject(j);
                    System.out.println(house.getString("projectName")+ "\t" + house.getString("floorNo")+ "\t" + house.getDouble("price")+ "\t" + house.getString("houseStatus")+ "\t" + house.getString("hxTypeStr") + "\t" + house.getString("signDate") +  "\t" + house.getString("contractDate") +"\t" +house.getString("buildInArea") );
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
