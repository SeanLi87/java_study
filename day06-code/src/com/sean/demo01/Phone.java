package com.sean.demo01;

/*
 * 声明一个手机类
 * 属性：
 *   1.品牌 String brand;
 *   2.价格 double price;
 *   3.颜色 String color;
 * 行为：
 *   1.打电话 pulic void call(String who) {}
 *   2.群发短信 public void sendMessage() {}*/
public class Phone {
    String brand;
    double price;
    String color;

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }
}
