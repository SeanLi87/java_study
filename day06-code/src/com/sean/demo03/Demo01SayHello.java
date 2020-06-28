package com.sean.demo03;

public class Demo01SayHello {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "王健林";
        System.out.println(person);
        person.sayHello("王思聪");
    }

}
