package com.sean.demo04;

public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(19);
        stu1.setName("小明");
        System.out.println("姓名：" + stu1.getName()+"， 年龄： "+stu1.getAge());
        System.out.println("==========");
        Student stu2 = new Student("小王",18);
        System.out.println("姓名：" + stu2.getName()+"， 年龄： "+stu2.getAge());
        stu2.setName("老王");
        stu2.setAge(20);
        System.out.println("姓名：" + stu2.getName()+"， 年龄： "+stu2.getAge());

    }
}
