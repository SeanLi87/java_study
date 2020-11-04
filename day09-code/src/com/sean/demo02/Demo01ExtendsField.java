package com.sean.demo02;
/*
* 在父子类的继承关系当中，如果成员变量重名，则又两种访问方式：
* 直接通过子类对象访问成员变量：
*   等号左边是谁，就优先用谁，没有就向上查找
* 间接通过成员方法访问成员变量
*   方法属于谁，就优先用谁，没有就向上查找
* */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);//10 只能用父类的东西，没有任何子类的内容
        System.out.println("===========");

        Zi zi = new Zi();

        System.out.println(zi.numFu); //10
        System.out.println(zi.numZi); //20
        System.out.println("===========");

        //等号左边是谁，就优先用谁
        System.out.println(zi.num);//200
//        System.out.println(zi.abc);//到处都没有，则编译报错
        System.out.println("===========");

        //这个方法是子类的，方法中的成员变量优先用子类的，没有则向上查找
        zi.methodZi();//200
        //这个方法是父类定义的，方法中的成员变量会优先用父类的
        zi.methodFu();//100


    }
}
