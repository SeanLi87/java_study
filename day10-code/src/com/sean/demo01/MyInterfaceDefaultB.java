package com.sean.demo01;

public class MyInterfaceDefaultB implements MyInterfaceDefault {

    @Override
    public void methodAbs() {
        System.out.println("这是实现类方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写接口的默认方法");
    }
}
