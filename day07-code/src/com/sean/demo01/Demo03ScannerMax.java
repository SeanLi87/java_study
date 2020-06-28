package com.sean.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int[] arrayA = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        int max = arrayA[0];
        for (int i = 1; i < arrayA.length; i++) {
            max = max > arrayA[i] ? max:arrayA[i];
        }
        System.out.println("输入的最大值是："+max);
    }
}
