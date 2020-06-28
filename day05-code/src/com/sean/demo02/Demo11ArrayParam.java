package com.sean.demo02;

public class Demo11ArrayParam {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};//数组的静态初始化简略写法
        System.out.println("main方法里的array地址：" + arrayA);
        printArray(arrayA);

    }

    public static void printArray(int[] array) {
        System.out.println("收到的地址值： " + array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
