package com.sean.demo04;
/*
* java.util.Math 是数学相关的的工具类，里面提供了大量的静态方法，完成与数学相关的运算操作。
* 备注：JDK1.8还在Math还在lang里
*
* 四个常用方法：
* public static double abs(double num):获取绝对值
* public static double ceil(double num):向上取整,只入不舍，正负数通用
* Public static double floor(double num):向下取整，只舍不入，正负数通用
* public static double round(double num):四舍五入
*
* Math.PI 代表近似的圆周率常量
* */
public class Demo03Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));//3.14
        System.out.println(Math.abs(-3.14));//3.14
        System.out.println(Math.abs(0));//0
        System.out.println("=================");
        //向上取整
        System.out.println(Math.ceil(3.9));//4
        System.out.println(Math.ceil(3.1));//4
        System.out.println(Math.ceil(3.0));//3
        System.out.println(Math.ceil(-1.1));//-1
        System.out.println(Math.ceil(-1.9));//-1
        System.out.println("=================");
        //向下取整
        System.out.println(Math.floor(3.9));//3
        System.out.println(Math.floor(3.1));//3
        System.out.println(Math.floor(0));//0
        System.out.println(Math.floor(-1.1));//-2
        System.out.println(Math.floor(-1.9));//-2
        System.out.println("=================");
        //四舍五入
        System.out.println(Math.round(2.5));//3
        System.out.println(Math.round(2.4));//2
        System.out.println(Math.round(0));//0
        System.out.println(Math.round(-1.1f));//-1
        System.out.println(Math.round(-1.5f));//-1
        System.out.println(Math.round(-1.6f));//-2


    }
}
