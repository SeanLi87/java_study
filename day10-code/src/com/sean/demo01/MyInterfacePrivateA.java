package com.sean.demo01;
/*
* 问题描述：
* 我们需要抽取一个共有方法，用来解决两个默认/静态方法之间重复代码的问题。
* 但是这个共有方法不应该让实现类使用，应该是私有化的。
*
* 解决方案：
* 从 java9开始，接口当中允许定义私有方法。
* 1.普通私有方法，解决多个默认方法之间重复代码问题
* 格式：
* private 返回值类型 方法名称(参数列表) {
*   方法体
* }
*
* 2.静态私有方法，解决多个静态方法之间重复代码的问题
* 格式：
 * private static 返回值类型 方法名称(参数列表) {
 *   方法体
 * }
*
* */
public interface MyInterfacePrivateA {

    public default void methodDefault1() {
        System.out.println("默认方法1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodDefault();
    }

    public default void methodDefault2() {
        System.out.println("默认方法2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
        methodDefault();
    }

    //一般的解决默认方法重复代码抽取,但是会被实现类访问到。

    public default void methodDefault() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    //如何解决？在java1.9或者更高版本里，可以定义私有方法来解决，这样只能被本类中的default方法访问
    /*
    * 伪代码实现
    * 针对default的公共方法抽取，定义私有方法
    * private void methodCommon(){
    *   System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    * }
    * 针对static德尔公共方法抽取，定义私有方法
    * private static void methodCommon(){
    *   System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    * }
    *
    *
    * */
}
