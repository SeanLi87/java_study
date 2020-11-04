package com.sean.demo04;

import java.util.ArrayList;
import java.util.Random;

/*
 * 1.生成1个1~33的随机整数
 * 2.生成第2个1~33的随机整数
 * 3....直到生成第6个随机整数（循环生成即可）
 * 4.将所有整数添加到集合中(可以和生成随机数一起在循环中添加)
 * 5.遍历集合
 * */
public class Demo06ArrayListRandom {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int randomNum = r.nextInt(33) + 1;
            list.add(randomNum);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println("打印所有arraylist集合中的元素：" + list.get(i));
        }

    }
}
