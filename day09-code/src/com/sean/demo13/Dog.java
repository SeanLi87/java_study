package com.sean.demo13;
/*
* 抽象类的子类必须重写抽象父类中的所有抽象方法，除非子类也是抽象类
* */
public abstract class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    //sleep（）可以让下级子类进行重写实现

}
