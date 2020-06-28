package com.sean.demo02;

public class Demo12ArrayReturn {
    public static void main(String[] args) {
        int[] arrayA = caculate(10, 20, 30);
        System.out.println("sum：" + arrayA[0]);
        System.out.println("avg：" + arrayA[1]);
        System.out.println("main方法中的数组地址：" + arrayA);

    }

    public static int[] caculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};
        System.out.println("方法中的数组地址：" + array);
        return array;
    }
}
