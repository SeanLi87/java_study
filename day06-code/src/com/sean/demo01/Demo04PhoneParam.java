package com.sean.demo01;
//对象可以作为参数传递给对象
public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8888.88;
        one.color = "黑色";
        phone(one);
        one.sendMessage();
        one.call("乔布斯");

    }
    public static void phone(Phone param) {//param传递的是对象的地址值
        System.out.println(param.color);
        System.out.println(param.brand);
        System.out.println(param.price);
    }
}
