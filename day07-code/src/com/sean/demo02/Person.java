package com.sean.demo02;

public class Person {

    String name;
    public void show() {
        System.out.println("我的名字是："+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
