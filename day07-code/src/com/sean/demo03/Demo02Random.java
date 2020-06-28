package com.sean.demo03;

import java.util.Random;
/*
* r.nextInt(10)是一个左闭右开区间，取的是0~9之间的随机数字*/
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
