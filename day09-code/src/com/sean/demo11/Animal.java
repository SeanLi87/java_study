package com.sean.demo11;
/*
* 抽象方法：就是在返回值类型前加上abstract关键字，然后去掉大括号直接分号结束。
* 抽象类：抽象方法所在的类，必须是抽象类，在class之前写上abstract即可。
*
* 如何使用抽象类和抽象方法：
* 1. 不能直接创建new一个抽象类
* 2. 必须使用一个子类来继承抽象父类
* 3. 子类必须覆盖重写抽象父类中的所有抽象方法，除非子类也是抽象类
* 覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上大括号及方法体
* 4. 创建子类进行使用
* */
public abstract class Animal {//这是一个抽象类
    public abstract void eat();//这是一个抽象方法

    public void method(){//这是一个普通成员方法
        System.out.println("这是一个普通成员方法");
    }

}
