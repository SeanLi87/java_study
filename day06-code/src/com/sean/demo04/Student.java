package com.sean.demo04;
/*
* 一个标准的JAVA类通常包含下列四个组成部分
*   1.为所有成员变量添加private关键字修饰符(保证所有成员变量不会随意被外部修改)
*   2.为每一个成员变量添加getter/setter方法（为成员变量添加修改和获取入口）
*   3.编写一个无参构造方法
*   4.编写一个有参构造方法
*
* 这样一个标准类也叫Java Bean
* */

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
