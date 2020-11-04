package com.sean.demo01;

import java.util.Arrays;
/*
* 面向过程：当需要实现一个功能的时候，所有处理步骤都靠自己实现
* 面向对象：当需要实现一个功能的时候，不关心功能的具体步骤，而是找一个具有该功能的人来帮助我做事
* */
public class Demo01PrintArray {
    public static void main(String[] args) {
        //打印一个数组，格式为[1,2,3,4]
        int[] arrayA = {1, 2, 3, 4};//数组静态初始化的省略写法
        //以下是面向过程的写法，所有处理都必须自己写代码实现
        System.out.print("[");
        for (int i = 0; i < arrayA.length; i++) {
            if (i == arrayA.length - 1) {
                System.out.println(arrayA[i] + "]");
            }
            else {
                System.out.print(arrayA[i] + ", ");
            }
        }
        System.out.println("====================");
        //以下是面向对象的写法，所有处理只要找到对应的类和方法即可
        System.out.println(Arrays.toString(arrayA));//[1, 2, 3, 4]

    }
}
