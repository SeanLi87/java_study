package com.sean.demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        //不返回结果
        returnNoResult(1,2);
        //返回结果
        int num = returnResult(3,4);
        System.out.println("main中返回结果：" + num);
    }

    public static void returnNoResult(int a,int b) {
        int result = a + b;
        System.out.println("方法不返回结果："+ result);
    }

    public static int returnResult(int a, int b) {
        int result = a + b;
        System.out.println("方法返回结果：" + result);
        return result;
    }
}
