package com.sean.demo02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        //无参数
        printHelloWorld();
        //有参数
        printHelloWorld(10);
    }

    public static void printHelloWorld() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello,world");
        }
    }

    public static void printHelloWorld(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello,world");
        }
    }
}
