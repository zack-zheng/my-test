package com.zzz.test.my_test.exam.指定题库考试;

import java.util.Random;

public class AuditUtils {

    public static int getSpendTime(){
        Random random = new Random();
        return  (random.nextInt(600001) + 600000);
    }

    public static boolean 正确率(){
        Random random = new Random();
        int randomValue = random.nextInt(100); // 生成 0 到 99 的随机数
        return randomValue < 90;
    }
}
