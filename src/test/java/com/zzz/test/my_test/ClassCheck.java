package com.zzz.test.my_test;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class ClassCheck {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, Exception {
        String demoJsonString = FileUtils.readFileToString(new File("E:\\dev\\vscode\\demo.json"));
        Demo demo = JSONObject.parseObject(demoJsonString,Demo.class);

        checkClass(demo);
    }

    public static void checkClass(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取所有类的属性=
        Field[] fields = object.getClass().getDeclaredFields();
        //遍历所有属性
        for (int i = 0; i < fields.length; i++) {
            //设置可以访问私有变量
            fields[i].setAccessible(true);
            //获取属性类型
            String type = fields[i].getGenericType().toString();
            //获取属性名称
            String name = fields[i].getName();
            System.out.println("当前类型为:" + type + " 当前名称为:" + name);


            if (type.startsWith("class")){
//                checkClass()
            }
            //endsWith是否一指定后缀为结尾
            if (type.endsWith("String")) {
                //获取get方法
                Method method = type.getClass().getMethod( getFiledName(name));
                //通过get方法获取属性值
                String value = String.valueOf(method.invoke(object));
                System.out.println("get方法获取的值为:" + value);
            }


        }
    }

    private static String getFiledName(String name) {
        StringBuilder stringBuilder = new StringBuilder(name);
        String str = name.substring(0,1).toUpperCase(Locale.ROOT);
        stringBuilder.replace(0,1,str);
        System.out.println("当前的属性名称为:" + stringBuilder);
        return "get" +stringBuilder.toString();
    }
}