package com.sean.demo02;
/*
* 快速遍历数组array.fori*/
public class Demo08ArrayMax {
    public static void main(String[] args) {
        int[] arrayA = {1,3,2,4,5};//数组静态初始化的简写
        int max = 0;
//        for (int i = 0; i < arrayA.length; i++) {
//            max = max >= arrayA[i] ? max:arrayA[i];
//        }
        for (int i : arrayA) {
            max = max >= i ? max:i;
        }

        System.out.println(max);
    }
}
