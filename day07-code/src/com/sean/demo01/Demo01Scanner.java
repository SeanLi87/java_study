package com.sean.demo01;

import java.util.Scanner;

/*
 * scanner类的功能，可以使键盘中输入数据到程序中
 *
 * 引用类型的一般使用步骤
 *   1.import 包路径.类名称
 *       如果使用的类和当前类在同一个包下，则可以省略导包语句不写
 *       只有java.lang包下的内容不需要单独导,其他的包都需要单独import
 *
 *   2.创建
 *   类名称 对象名称 = new 类名称();
 *   类名称 对象名称 = new 类名称(xxx,xxx);
 *   3.使用
 *   对象名称.成员方法名称();
 * */
public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("从键盘输入的数字：" + num);
        String str = sc.next();
        System.out.println("从键盘输入的字符串：" + str);
    }
}
