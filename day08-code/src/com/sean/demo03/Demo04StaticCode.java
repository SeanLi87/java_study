package com.sean.demo03;
/*
* 静态代码块的格式是：
* public class 类名称 {
*   static{
*       //静态代码块内容
*   }
*  }
*
*  特点：在第一次用到本类时，静态代码块执行唯一的一次。
*
*  静态代码块的典型用途：
*  用来一次性地对静态成员变量进行赋值
* */
public class Demo04StaticCode {

    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
