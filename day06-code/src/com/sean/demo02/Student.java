package com.sean.demo02;

public class Student {
    private String name;
    private int age;
    private boolean male;

    public void show() {
        System.out.println("姓名： "+ name + " 年龄： "+ age + " 性别： " + male);
    }

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }
}
