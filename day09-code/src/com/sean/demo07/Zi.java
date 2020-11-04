package com.sean.demo07;

public class Zi extends Fu {

    public Zi() {
//        super();//调用父类的无参构造方法
        super(10);//调用父类的有参重载构造方法
        System.out.println("子类构造方法执行");
    }

    public void method(){
//        super();//错误写法，只有子类构造方法才能调用父类构造方法
    }
}
