package com.zzz.test.my_test;
import java.io.File;

public class FileCount {
    public static void main(String[] args) {
        // 输入文件夹路径
        String folderPath = "H:\\相片";

        // 创建File对象
        File folder = new File(folderPath);

        // 获取该文件夹中的所有文件
        File[] files = folder.listFiles();

        // 计算文件数量
        int count = 0;
        for (File file : files) {
            if (file.isFile()) {
                count++;
            } else if (file.isDirectory()) {
                // 如果是文件夹，则递归调用该方法
                count += countFiles(file);
            }
        }

        // 输出文件数量
        System.out.println("文件夹中的所有文件数量为：" + count);
    }

    private static int countFiles(File folder) {
        // 获取该文件夹中的所有文件
        File[] files = folder.listFiles();

        // 计算文件数量
        int count = 0;
        for (File file : files) {
            if (file.isFile()) {
                count++;
            } else if (file.isDirectory()) {
                // 如果是文件夹，则递归调用该方法
                count += countFiles(file);
            }
        }

        return count;
    }
}