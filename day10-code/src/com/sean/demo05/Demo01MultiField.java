package com.sean.demo05;

/*
* 访问成员变量的两种方式：
*
* 1.直接通过对象名称访问成员变量，看等号左边是谁，优先用谁，没有则向上查找
* 2.间接通过成员方法访问成员变量，看方法属于谁，优先用谁，没有则向上查找
* */

public class Demo01MultiField {

    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age); //错误写法！
        System.out.println("=============");

        obj.showNum();//子类没有覆盖重写，显示的父类num; 若子类覆盖重写，则显示子类num
    }
}
