package com.sean.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        //首先设置一个教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "101教室";

        Student one = new Student("小王",20);
        System.out.println(one.getName());
        System.out.println(one.getAge());
        System.out.println(Student.room);

        System.out.println("=========");
        Student two = new Student("小李",22);
        System.out.println(two.getName());
        System.out.println(two.getAge());
        System.out.println(Student.room);
    }
}
