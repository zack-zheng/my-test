package com;

/**
 * Created by zhengzz on 2017/8/25.
 */
public class TestBranch {
    public static void main(String[] args) {
        System.out.println("test branch 2 commit 3");
        printInfo();
    }

    private static void printInfo() {
        System.out.println("test branch 2 commit 4 after merge to master");
    }
}
