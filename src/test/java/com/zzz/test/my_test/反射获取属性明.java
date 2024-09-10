package com.zzz.test.my_test;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class 反射获取属性明 {

    public static void main(String[] args) throws Exception {
        String demoJsonString =FileUtils.readFileToString(new File("E:\\dev\\vscode\\demo.json"));
        Demo demo = JSONObject.parseObject(demoJsonString,Demo.class);


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
