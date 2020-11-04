package com.sean.demo03;

/*
 * 一个成员变量如果用了static关键字，那么这个变量不再属于对象，而是属于所在类。多个多像共享一份数据。
 * */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("小王", 20);
        System.out.println(one.getName() + one.getAge() + "ID: " + one.getId());
        Student two = new Student("小李", 22);
        System.out.println(two.getName() + two.getAge() + "ID: " + two.getId());
        one.room = "101教室";
        System.out.println(one.room);
        System.out.println(two.room);


    }
}
