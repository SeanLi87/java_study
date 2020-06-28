package com.sean.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =  sc.nextInt() + sc.nextInt();
        System.out.println("从键盘输入的数组和为：" + sum);
    }
}
