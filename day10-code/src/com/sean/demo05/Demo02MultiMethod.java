package com.sean.demo05;
/*
* 在多态的代码当中，成员方法访问规则是：
*   看new的是谁，就优先用谁，没有则向上查找
*
* 口诀：编译看左边，运行看右边. 先编译，再运行
*
* 对比一下：
* 成员变量：编译看左边，运行看左边
* 成员变量：编译看左边，运行看右边
* */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();
//        obj.methodZi();//错误写法！因为编译时，找不到Fu类下名为methodZi的成员方法
        ((Zi) obj).methodZi();//向下转型写法
    }
}
