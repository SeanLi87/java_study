package com.sean.demo06;
/*
* 使用接口的实现演示向上转型
* */
public class Demo02Interface {

    public static void main(String[] args) {
        //在接口的实现中，向上转型就是，接口引用指向实现对象
        Interface impl = new InterfaceImpl();
        impl.method();
        int a = (int) 10.1;
        System.out.println(a);
    }
}
