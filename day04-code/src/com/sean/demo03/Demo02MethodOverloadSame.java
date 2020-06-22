package com.sean.demo03;

//作业：比较两个数值是否相同，两个int，两个short,两个long
public class Demo02MethodOverloadSame {
    public static void main(String[] args) {
        System.out.println(isSame((byte) 127,(byte) 128));
        System.out.println(isSame((short) 1, (short) 1));
        System.out.println(isSame(32768L, 32768L));
        System.out.println(isSame(9223372036854775806L, 9223372036854775806L));

    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("比较byte"+a);
        return a == b;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("比较int");
        return a == b;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("比较short");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("比较long");
        return a == b;
    }

}
