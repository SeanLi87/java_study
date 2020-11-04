package com.sean.demo01;
/*
* 在继承的关系中，“子类就是父类”。也就是说，子类可以被当成父类看待。
* 例如父类是员工，子类是讲师，那么“讲师也是一个员工”。关系表述：is a
*
* 定义父类的格式：（一个普通的类定义）
* public class 父类名称{
*   //....
*   }
*
* 定义子类的格式：
* public class 子类名称 extends 父类名称{
*   //...
*   }
* */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类
         Teacher one = new Teacher();
         //Teacher类中虽然什么都没写，但是会继承父类的方法
         one.method();
         //创建另一个子类
         Assistant two = new Assistant();
         two.method();
         Employee t1 = new Teacher();
         ((Teacher) t1).methodT();
         Teacher t2 = (Teacher)t1;

    }
}
