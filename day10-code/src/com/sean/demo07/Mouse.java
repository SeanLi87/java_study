package com.sean.demo07;
/*
* 鼠标需要基于USB接口进行制造，因此是USB的实现类，“公口”*/
public class Mouse implements Usb {
    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");

    }

    public void click() {
        System.out.println("点击");
    }
}
