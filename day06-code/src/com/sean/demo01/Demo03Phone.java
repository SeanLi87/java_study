package com.sean.demo01;

public class Demo03Phone {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        System.out.println(iphone.brand);
        System.out.println(iphone.price);
        System.out.println(iphone.color);
        System.out.println("===========");
        iphone.brand = "苹果手机";
        iphone.price = 9999.0;
        iphone.color = "白色";
        System.out.println(iphone.brand);
        System.out.println(iphone.price);
        System.out.println(iphone.color);
        System.out.println("===========");
        iphone.call("乔布斯");
        iphone.sendMessage();
    }

}
