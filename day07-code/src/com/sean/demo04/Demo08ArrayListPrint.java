package com.sean.demo04;

import java.util.ArrayList;

/*
 * 定义以指定格式打印集合的方法（ArrayList作为参数），以{}扩起集合，使用@分割每个元素。
 * 格式参照{元素@元素@元素}
 * 1.创建一个static方法，返回类型为void,参数类型为ArrayList
 * 2.使用print打印{
 * 3.遍历元素，每次打印 元素@
 * 4.判断是否为最后一个元素，若是则打印 元素}
 * */
public class Demo08ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小王");
        list.add("小李");
        list.add("小明");
        list.add("小张");
        System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == (list.size() - 1)) {
                System.out.println(list.get(i) + "}");
            }
            else {
                System.out.print(list.get(i) + "@");
            }
        }
    }

}
