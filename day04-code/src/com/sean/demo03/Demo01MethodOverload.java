package com.sean.demo03;

/*
 * 方法的重载用于解决功能相同，但是参数不同的方法需要调用不同方法名的问题
 * 只用调用相同方法名，传入不同参数就能调用不同方法
 * 格式：方法名称一样，与下列因素相关:
 * 1.参数个数不同
 * 2.参数类型不同
 * 3.多类型的顺序不同
 *
 * 与下列因素无关:
 * 1.跟参数名称无关
 * 2.与方法返回值类型无关*/
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1.1, 1.2));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(double a, double b) {
        return (int) (a + b);
    }

    public static int sum(double a, int b) {
        return (int) (a + b);
    }

    public static int sum(int a, double b) {
        return (int) (a + b);
    }

}
