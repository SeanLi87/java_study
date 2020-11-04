package com.sean.demo04;

import java.util.ArrayList;
import java.util.Random;

/*
 * 题目：用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。
 * 要求：使用自定义的方法来实现筛选
 * */
public class Demo09ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();

        //将20个随机数字存入大集合
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNumber = r.nextInt(100);
            bigList.add(randomNumber);

        }

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("大集合：" + bigList);
        System.out.println("小集合：" + smallList);
        System.out.println("偶数总共有："+smallList.size());

    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> resultList = new ArrayList<>();
        //筛选
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                resultList.add(num);
            }
        }
        return resultList;
    }

}
