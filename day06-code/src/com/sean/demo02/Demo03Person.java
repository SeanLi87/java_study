package com.sean.demo02;

public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();
//        person.age = 12;//错误写法，private变量不能直接访问
        person.setAge(20);
        person.setName("小王");
        person.show();
    }
}
