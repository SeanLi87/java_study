package com.sean.demo03;

public class Demo04OverloadPrint {
    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 1.1f;
        double f = 1.2;
        char g = 'a';
        String h = "b";
        boolean i = true;
        print(a);print(b);print(c);print(d);print(e);print(f);print(g);print(h);print(i);


    }

/*
三要素
方法名：print
参数：输入不同类型的数据，byte,short,int,long,float,double,char,boolean,string
*/
    public static void print(byte a) {
        System.out.println("打印byte");
        System.out.println(a);
    }

    public static void print(short a) {
        System.out.println("打印short");
        System.out.println(a);
    }

    public static void print(int a) {
        System.out.println("打印int");
        System.out.println(a);
    }

    public static void print(long a) {
        System.out.println("打印long");
        System.out.println(a);
    }

    public static void print(float a) {
        System.out.println("打印float");
        System.out.println(a);
    }

    public static void print(double a) {
        System.out.println("打印double");
        System.out.println(a);
    }

    public static void print(char a) {
        System.out.println("打印char");
        System.out.println(a);
    }

    public static void print(String a) {
        System.out.println("打印string");
        System.out.println(a);
    }

    public static void print(boolean a) {
        System.out.println("打印boolean");
        System.out.println(a);
    }
}
