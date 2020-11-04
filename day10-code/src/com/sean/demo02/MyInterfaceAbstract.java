package com.sean.demo02;

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A的方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口中冲突的默认方法进行覆盖重写");

    }
}
