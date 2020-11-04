package com.sean.demo02;
/*
* 快速遍历数组array.fori*/
public class Demo09ArrayMin {
    public static void main(String[] args) {
        int[] arrayA;
        arrayA = new int[]{4,2,1,4,};//数组静态初始化的两步写法，注意第二步不能简写
        int Min = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            Min = Min <= arrayA[i] ? Min:arrayA[i];
        }

        System.out.println(Min);
    }
}
