package com.sean.demo02;
/*
* 数组的长度在程序运行期间不可以改变
* 初始化一个数组之后，可以重复使用数组名字进行new数组，但是new过之后会引用到最新得数组，以前得数组不再引用*/
public class Demo06ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[]{1,2,3};
        System.out.println(arrayA.length);
        arrayA = new int[]{1,2,3,4};
        System.out.println(arrayA.length);
        arrayA = new int[2];
        System.out.println(arrayA.length);

    }
}
