package com.sean.demo02;

import java.util.Scanner;

/*
 * 题目：键盘输入一个字符串，并且统计其中各种字符出现的次数
 * 种类有：大写字母，小写字母，数字，其他
 * 思路：
 * 1.创建一个字符串，内容从键盘输入
 * 2.将字符串转化成char[]数组
 * 3.遍历数组，判断每个元素的类型，并统计
 * */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        char[] chars = str.toCharArray();
        int numberCount = 0;
        int upperCount = 0;
        int lowerCount = 0;
        int otherCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A'<=ch && ch <='Z') {
                upperCount++;
            }
            else if ('a'<=ch && ch <='z') {
                lowerCount++;
            }
            else if ('0'<=ch && ch <='9'){
                numberCount++;
            }
            else {
                otherCount++;
            }
        }
        System.out.println("数字类型，大写字母类型，小写字母类型，其他类型分别为：" + numberCount + " ," + upperCount + " ," + lowerCount + " ," + otherCount);
    }
}
