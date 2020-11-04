package com.sean.demo02;

public interface MyInterfaceA {

    public abstract void methodA();

    public static void methodStatic() {
        System.out.println("接口A中的静态方法");
    }

    public default void methodDefault(){
        System.out.println("接口A中的默认方法");

    }

    public abstract void method();
}
