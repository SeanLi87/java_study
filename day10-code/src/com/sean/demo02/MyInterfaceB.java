package com.sean.demo02;

public interface MyInterfaceB {

    public abstract void methodB();

    public static void methodStatic() {
        System.out.println("接口B中的静态方法");
    }

    public default void methodDefault(){
        System.out.println("接口B中的默认方法");

    }

    public abstract void method();


}
