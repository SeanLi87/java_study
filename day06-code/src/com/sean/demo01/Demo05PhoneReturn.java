package com.sean.demo01;
//对象可以作为返回值返回

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone iphone = getPhone();
        System.out.println(iphone.price);
        System.out.println(iphone.brand);
        System.out.println(iphone.color);
    }

    public static Phone getPhone () {
        Phone one = new Phone();
        one.color = "玫瑰金";
        one.price = 8888.8;
        one.brand = "苹果";
        return one;
    }
}
