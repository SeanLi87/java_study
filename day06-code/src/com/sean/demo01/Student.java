package com.sean.demo01;
/*
* 定义一个类，用来模拟"学生"事物,其中包含两个组成部分
*
* 属性（是什么，有什么特征），成员变量
*   姓名： String name；
*   年龄： Int age;
* 行为（能干什么，有什么功能），成员方法
*   吃饭：public void eat() {}//成员方法不能包含static
*   睡觉：public void sleep() {}
*   学习：public void study() {}
* */
public class Student {
    //定义成员变量
    String name;
    int age;
    //定义成员方法
    public void eat() {
        System.out.println("吃饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
    public void study() {
        System.out.println("学习");
    }

    {
        System.out.println("这是类的静态代码块");
    }
}
