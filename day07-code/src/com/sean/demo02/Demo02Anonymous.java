package com.sean.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //对象返回值赋值的一般写法
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("输入的数字： "+num);

        //匿名对象写法
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的数字： "+num);

        //对象作为参数的一般写法
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //匿名对象作为方法参数的写法
//        methodParam(new Scanner(System.in));

        //匿名对象作为方法返回值
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的数字：" + num);

    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的数字： " + num);
    }

    public static Scanner methodReturn() {
        //对象作为返回值一般写法
//        Scanner sc = new Scanner(System.in);
//        return sc;

        //匿名对象作为返回值写法
        return new Scanner(System.in);
    }
}
