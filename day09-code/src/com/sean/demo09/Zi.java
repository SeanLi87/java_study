package com.sean.demo09;
/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种：
*
* 1. 在本类的成员方法中，访问本类的成员变量
* 2. 在本类的成员方法中，访问本类的另一个成员方法
* 3. 在本类的构造方法中，访问本类的另一个构造方法
* 在第三种方法中要注意：
* A.this(...)调用也必须是构造方法的第一个语句，唯一一个。
* B.super和this两种构造调用，不能同时使用
* C.注意不能形成回调，就是构造方法A调用构造方法B,构造方法B又调用构造方法A
* */
public class Zi extends Fu{
    int num = 20;

    public Zi() {
//        super();//不再赠送默认super
        this(10);
//        this(1,2)//错误写法
        System.out.println(this.num);

    }

    public Zi(int n) {

    }

    public Zi(int n,int m) {

    }

    public void method() {
        System.out.println(num);
        System.out.println(this.num);
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        this.method();//等价于method();使用this可以强调使用的是本类当中的成员方法
        System.out.println("BBB");
    }
}
