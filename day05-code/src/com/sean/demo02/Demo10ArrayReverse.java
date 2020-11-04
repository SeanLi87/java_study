package com.sean.demo02;

/*
 * 快速遍历数组array.fori*/
public class Demo10ArrayReverse {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1,2,3,4,5};//数组静态初始化的标准写法
        /*
         * 梳理算法实现
         * 1.将前者（min索引,从左侧0开始）元素的值赋值给temp变量
         * 2将后者（max索引，从右侧array.length-1开始）元素的值赋值给第一个元素
         * 3.将temp变量的值赋值给最后一个元素
         * 4.持续循环，直到两者的索引相交或者相等*/
        System.out.println("数组长度"+arrayA.length);
        for (int i : arrayA) {
            System.out.println("原始数组：" +i);
        }
        for (int min = 0, max = arrayA.length - 1; min < max; min++, max--) {
            int temp = arrayA[min];
            arrayA[min] = arrayA[max];
            arrayA[max] = temp;
        }
        for (int i : arrayA) {
            System.out.println("反转后的数组：" +i);
        }
    }
}
