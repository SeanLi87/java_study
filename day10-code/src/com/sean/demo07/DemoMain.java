package com.sean.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        Usb usbMouse = new Mouse();//多态写法，向上转型

        laptop.useUsbDevice(usbMouse);//传入的正好是Usb的类型对象

        Keyboard keyboard = new Keyboard();

        //手动向上转型
//        Usb usbKeyboard = keyboard;

        //或者直接传入，代码将会自动向上转型
        laptop.useUsbDevice(keyboard);

        //使用子类对象，匿名对象，也可以
//        laptop.useUsbDevice(new Keyboard());
        laptop.powerOff();
    }
}
