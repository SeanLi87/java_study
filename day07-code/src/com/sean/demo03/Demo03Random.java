package com.sean.demo03;


import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = getRandom(10);
            System.out.println("获取0到10之间的随机数：" + num);

        }
    }

    public static int getRandom(int n) {
        Random r = new Random();
        int num = r.nextInt(n) + 1;
        return num;
    }
}
