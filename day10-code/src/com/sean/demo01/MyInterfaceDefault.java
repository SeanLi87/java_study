package com.sean.demo01;
/*
* 从Java8开始，接口里允许自定义默认方法。
* 格式：
* public default 返回值类型 方法名称（参数列表）{
*       // ...
*   }
*
* 备注：接口中的默认方法，可以解决接口升级问题（比如新增加了抽象方法）
* */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void methodAbs();

    //新增抽象方法
//    public abstract void methodAbs1();

    //新增默认方法
    public default void methodDefault(){
        System.out.println("这是默认方法");
    }
}

