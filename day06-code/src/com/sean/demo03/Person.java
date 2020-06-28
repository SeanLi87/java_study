package com.sean.demo03;
/*
* 当方法的局部变量和类的成员变量名字相同时，根据就近原则，使用局部变量
* 如果需要访问本类中的成员变量，则需要使用格式：this.成员变量名
*
* "通过谁调用的，谁就是this"
* */
public class Person {
    String name;

    public void sayHello(String name) {
        System.out.println(name +"，你好，我是" +this.name);
        System.out.println(this);
    }
}
