package com.sean.demo02;
/*
 * 数组空指针异常
 * 数组必须new才能被使用，如果只是被赋值成null值,没有进行new创建，那么会发生空指针异常
 * NullPointerException
 *
 * 原因：忘了new
 * 解决：补上new*/
public class Demo05ArrayNull {
    public static void main(String[] args) {
        int[] arrayA = null;//数组初始化方法拆成两步中得第一步或者int[] arrayA;

        arrayA = new int[3];//使用动态初始化方法第二步
//        arrayA = new int[]{1,2,3};//也可以使用静态初始化方法中的第二步
//        arrayA = {1,2,3};//错误写法！！！初始化方法在第二步时不必须要使用new
        System.out.println(arrayA[0]);
    }
}
