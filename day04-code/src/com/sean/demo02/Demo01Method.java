package com.sean.demo02;

public class Demo01Method {
    public static void main(String[] args) {
//        printRectangle();
        //单独调用
        sum(1,2);
        //打印调用
        System.out.println(sum(1,2));
        //赋值调用
        int sum = sum(1,2);
        System.out.println(sum);
    }
//矩形打印
    public static void printRectangle() {
        for (int n = 1; n <= 5; n++) {
            for (int i = 1; i <= 4; i++)
                System.out.print("*");
            System.out.println("*");
        }
    }
//加法定义
    public static int sum(int a, int b) {
        System.out.println("方法执行啦");
        int result = a + b;
        return result;
    }
}
