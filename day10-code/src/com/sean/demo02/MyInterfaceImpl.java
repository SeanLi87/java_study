package com.sean.demo02;

public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A的方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B的方法");

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法进行覆盖重写");

    }

    @Override
    public void method() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }
}
