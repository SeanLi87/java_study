package com.sean.demo02;
/*
* 面向对象三大特征：封装，继承，多态
* 封装性在java中的体现
* 1.方法就是一种封装
* 2.关键字private也是一种封装*/
public class Demo02Method {
    public static void main(String[] args) {
        int[] arrayA = {100,10,1};
        int maxNum = max(arrayA);
        System.out.println(maxNum);

    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = max > array[i] ? max : array[i];
        }
        return max;
    }
}
