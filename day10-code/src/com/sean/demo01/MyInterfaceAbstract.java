package com.sean.demo01;
/*
*在任何版本的java中，接口都能定义抽象方法。
* 格式：
* public abstract 返回值类型 方法名称();
*
* 注意事项：
* 1. 接口当中的抽象方法，修饰符必须是两个固定的关键字，public abstract
* 2. 这两个关键字的修饰符，可以选择性地省略。（刚开始学习，不推荐省略）
* 3. 方法的三要素可以按规范随意定义
* */
public interface MyInterfaceAbstract {
    public String a="1";
    //这是抽象方法
    abstract void method2();
    //这是抽象方法
    public void method3();
    //这是抽象方法
    void method4();
    //这是抽象方法
    public abstract void method1();

}
