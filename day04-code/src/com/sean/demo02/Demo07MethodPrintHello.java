package com.sean.demo02;

public class Demo07MethodPrintHello {
    public static void main(String[] args) {
    //直接调用
        printHello(10);
    }

    /*
    方法三要素
    1.方法名：printHello
    2.方法返回值：null
    3.方法传参：指定次数 int a
     */
    public static void printHello(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("第" + i + "次" + "Hello, world!");
        }
    }
}
