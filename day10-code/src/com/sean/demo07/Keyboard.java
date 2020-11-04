package com.sean.demo07;
/*
* 键盘需要基于USB接口进行制造，因此是USB的实现类，“公口”*/
public class Keyboard implements Usb {
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");

    }
    public void input() {
        System.out.println("打字");
    }
}
