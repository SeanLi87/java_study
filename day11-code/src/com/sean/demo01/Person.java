package com.sean.demo01;
/*
* 对于成员变量来说，如果用了final关键字修饰，那么这个变量也照样是不可改变的
*
* 1.由于成员变量具有默认值，所以用了final之后必须手动赋值，不会再给默认值了
* 2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值，二者选其一
* 3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值
* */
public class Person {
    private final String name/* = "鹿晗"*/;//第一种，直接赋值

    public Person() {
        name = "鹿晗";//第二种，构造方法赋值
    }

    public Person(String name) {
        this.name = name;//同样是构造方法赋值，只是需要new的时候创建
    }

    public String getName() {
        return name;
    }
//针对final的成员变量，不能再用setter
//    public void setName(String name) {
//        this.name = name;
//    }
}
