package com.sean.demo01;

public class Demo02Interface {

    public static void main(String[] args) {
        //创建了实现类对象
        MyInterfaceDefaultA A = new MyInterfaceDefaultA();
        A.methodAbs();
        //调用默认类，如果实现类中没有，则往上找
        A.methodDefault();
        System.out.println("==================");
        //创建了实现类对象
        MyInterfaceDefaultB B = new MyInterfaceDefaultB();
        B.methodAbs();
        //实现类B覆盖重写接口的默认方法
        B.methodDefault();
    }
}
