package com.zzz.test.my_test;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class 反射获取属性明 {

    public static void main(String[] args) throws Exception {
        // 创建一个示例JSON文件用于测试
        String demoJsonString = "{\n" +
                "  \"metaData\": {\n" +
                "    \"caseNo\": \"100200\",\n" +
                "    \"inputter\": \"inputter1\",\n" +
                "    \"type\": \"reg\",\n" +
                "    \"subType\": \"\",\n" +
                "    \"round\": 0,\n" +
                "    \"ddeType\": \"form\"\n" +
                "  },\n" +
                "  \"formContent\": {\n" +
                "    \"trusteeId\": \"8F756DF2AC5A45E8AD2741E5C1586AB4\"\n" +
                "  }\n" +
                "}";
        
        // 如果demo.json文件存在，则读取文件；否则使用示例数据
        File demoFile = new File("demo.json");
        if (demoFile.exists()) {
            demoJsonString = FileUtils.readFileToString(demoFile, "UTF-8");
        } else {
            System.out.println("demo.json文件不存在，使用示例数据");
        }
        
        Demo demo = JSONObject.parseObject(demoJsonString, Demo.class);
        getFieldName(demo);
    }
    public static void getFieldName(Object t){
        Class<?> clazz = t.getClass();
        // 获取实体类的所有属性信息，返回Field数组
        Field[] fields = clazz.getDeclaredFields();
        int length= fields.length;
        while(length-->0) {
            Field innerField = fields[length];
            System.out.println(innerField.getName());

            System.out.println(innerField.getType().getSimpleName());
        }
    }

}
