package com.sean.demo04;

import java.util.Arrays;
import java.util.Random;

/*
 * 题目：
 * 请使用Arrays相关的API,将一个随机字符串中的所有字符升序排列，并倒序打印
 * 思路：
 * 1.生成随机字符串：使用random，生成一个1-10个字符串随机长度，再循环长度，每次随机生成一个字符（ASCII码从97到？？）
 * 2.使用toArray方法将字符串转换成字符数组
 * 3.使用sort进行升序排序
 * 4.倒序遍历数组打印
 * */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String randomStr="";
        //生成指定长度的随机字符串
        Random r = new Random();
        int length = r.nextInt(10) + 1;
        for (int i = 0; i < length; i++) {
            char assic = (char) (r.nextInt(25) + 97);
            System.out.println(assic);
            randomStr+=assic;
        }
        System.out.println(randomStr);
        System.out.println("==========");
        //正序排序
        char[] chars = randomStr.toCharArray();
        Arrays.sort(chars);
        //倒序排序
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
