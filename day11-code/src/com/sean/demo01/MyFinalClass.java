package com.sean.demo01;
/*
* 当final关键字用来修饰一个类的时候，格式：
* public final class 类名称{
*   //...
*   }
*
* 含义：当前这个类不能有任何子类。（太监类）
* 注意：一个类如果是final类，那么其中的所有成员方法都无法进行覆盖重写（因为没儿子）
* */
public final class MyFinalClass {
    public final void method() {
        System.out.println("成员方法执行");
    }
}
