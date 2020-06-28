package com.sean.demo03;

public class Demo02Student {
    public static void main(String[] args) {
        //无参构造方法
        Student stu1 = new Student();
        //有参构造方法可以对成员变量初始化
        Student stu2 = new Student("小王",18);
        System.out.println(stu2.getAge()+stu2.getName());
        System.out.println("==========");
        //getter/setter可以对成员变量进行修改
        stu2.setAge(20);
        stu2.setName("老王");
        System.out.println(stu2.getAge()+stu2.getName());
    }
}
