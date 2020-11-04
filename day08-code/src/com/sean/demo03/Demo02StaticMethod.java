package com.sean.demo03;
/*
* 一旦使用了static修饰成员方法，那么就成了静态方法，静态方法不属于对象，而是属于类
*
* 如果没有static关键字，那么必须首先创建类，然后通过对象才能使用类中的方法或变量
* 如果有了static关键字，那么不需要创建类，直接就能通过类名称来使用类的方法或变量
*
* 无论是成员变量还是成员方法，如果有了static，都推荐用类名称进行调用
* 静态变量：类名称.静态变量
* 静态方法：类名称.静态方法
*
* 注意事项：
* 1.静态不能直接访问非静态。
* 原因：因为在内存当中，先有静态内容，再有非静态内容
* “先人不知道后人，后人知道先人”
* 2.静态方法当中不能用this
* 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。静态方法不需要对象调用。
* */
public class Demo02StaticMethod {

    public static void main(String[] args) {
        MyClass obj = new MyClass();//先创建对象
        obj.method();//然后才能调用成员方法

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        MyClass.methodStatic();//正确，而且推荐
        obj.methodStatic();//正确，但不推荐，这种写法在编译之后也会被javac翻译成为“类名称.静态方法名”

        //对于本类当中的静态方法，可以省略类名称
        myMethod();
        Demo02StaticMethod.myMethod();//完全等效
    }

    public static void myMethod() {
        System.out.println("本类静态方法");
    }

}
