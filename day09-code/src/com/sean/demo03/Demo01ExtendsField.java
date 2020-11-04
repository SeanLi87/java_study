package com.sean.demo03;
/*
* 当子类中出现局部变量，成员变量和父类成员变量都重名的时候，如何区分和引用？
* 局部变量：         直接写变量名
* 本类中的成员变量：   this.成员变量名
* 父类中的成员变量：   super.成员变量名
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
