package com.sean.demo01;
/*
* 注意事项：不能通过接口实现类的对象或者实现类来调用接口当中的静态方法。
* 正确用法：通过接口名称，直接调用其中的静态方法。
* 格式：
* 接口名称.静态类名称(参数);
* */
public class Demo03Interface {

    public static void main(String[] args) {
        //创建一个实现类
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
//        impl.staticMethod();//错误写法，不能通过实现类对象来调用接口的静态方法

//        MyInterfaceStaticImpl.staticMethod();//错误写法，也不能通过实现类来调用接口的静态方法

        MyInterfaceStatic.staticMethod();
    }

}
