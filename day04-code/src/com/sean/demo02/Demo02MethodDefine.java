package com.sean.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        //main方法调用sum方法，将结果赋值给number
        int number = sum(1,2);
        System.out.println(number);
        //main方法调用printSum方法，将结果在方法里打印
        printSum(1,2);
    }

    public static int sum(int a, int b) {
        System.out.println("调用sum方法");
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        System.out.println("调用printSum方法");
        int result = a + b;
        System.out.println(result);
    }
}
