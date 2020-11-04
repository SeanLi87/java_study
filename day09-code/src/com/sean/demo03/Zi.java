package com.sean.demo03;

public class Zi extends Fu {
    int num = 20;
    public void method() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
        System.out.println(Fu.class);
    }
}
