package com.sean.demo03;
/*
* 这个子接口当中有几个方法？4个
* methodA来源于接口A
* methodB来源于接口B
* methodCommon来源于接口A和B
* method来源于自己
*
*
* */
public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

}
