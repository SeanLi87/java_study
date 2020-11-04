package com.sean.demo02;
/*
* 局部变量和成员变量
* 1.定义的位置不一样【重点】
* 成员变量：在方法的内部
* 局部变量：在方法的外部，直接写在类当中
*
* 2.作用范围不一样【重点】
* 局部变量:只有在方法内部可以使用，出了方法就不能再使用
* 成员变量:整个类全都可以使用
*
* 3.默认值不一样【重点】
* 局部变量：没有默认值，要使用必须先手动赋值
* 成员变量：没有赋值会有默认值，规则和数组一样(new类型)
*
* 4.内存位置不一样
* 局部变量：位于栈内存
* 成员变量：位于堆内存
*
* 5.生命周期不一样
* 局部变量：随着方法一起创建，位于栈内存，随着方法出栈而消失
* 成员变量：随着对象一起创建（new），位于堆内存，随着对象被垃圾回收而消失
* */
public class Demo01VariableDifference {
    String name;//成员变量，会有初始值

    public static void main(String[] args) {
        Demo01VariableDifference testVariable = new Demo01VariableDifference();
        testVariable.methodA();
    }

    public void methodA() {
        int num =20;//局部变量，要使用必须进行初始化
        int[] numList = new int[3]; //局部变量，数组会默认初始化，可以直接使用
        System.out.println(numList.toString());
        System.out.println(name);
    }

    public void methodB(int param) {//方法参数是局部变量,方法在被调用的时候必然会被调用
        System.out.println(param);
    }
}
