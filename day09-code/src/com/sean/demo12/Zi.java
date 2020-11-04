package com.sean.demo12;

public class Zi extends Fu {

    public Zi() {
        //super();
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void method() {
        System.out.println("子类重载方法执行");
    }
}
