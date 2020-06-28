package com.sean.demo01;
/*
* 1.数组是一种引用数据类型（由类的构造函数创建，可以通过他们访问引用的对象）
* 2.数组中的多个数据，类型必须相同
* 3.数组的长度在程序运行期间不能改变
* 数组的常见初始化方式
* 1.动态初始化:指定长度
* 2.静态初始化：指定内容
* 注意事项：
* 1.虽然静态初始化没告诉长度，但是根据大括号中的内容可以推算出长度
* 2.静态初始化可以分成2个步骤
* 3.动态初始化也可以拆分成2个步骤
* 4.静态初始化方法一旦使用简单方式就不能拆分成2个步骤了
*
* 使用建议
* 如果不确定数组中的具体内容，用动态初始化，反之则用静态初始化*/
public class Demo01Array {
    public static void main(String[] args) {
        //动态初始化标准格式
        int[] arrayA = new int[10];
        String[] arrayB = new String[5];
        //分成两步的动态初始化
        double[] arrayC;
        arrayC = new double[3];
        //静态初始化的标准格式
        int[] arrayAA = new int[]{1,2,3};
        //省略的静态初始化
        String[] arrayBB = {"Hello","World","Java"};
        //分成两步的静态初始化
        double[] arrayCC;
        arrayCC = new double[]{1,2,3};


    }
}
