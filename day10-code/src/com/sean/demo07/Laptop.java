package com.sean.demo07;
/*电脑只使用USB设备，因此属于“母口”*/
public class Laptop {
    public void powerOn() {
        System.out.println("打开电脑");
    }
    public void powerOff() {
        System.out.println("关闭电脑");
    }

    //使用接口作为方法的参数
    public void useUsbDevice(Usb usb) {//如果传入的时Usb接口的实现类，那么会自动先向上转型后再传入
        usb.openDevice();
        if (usb instanceof Mouse) {//先判断
            Mouse mouse = (Mouse) usb;//向下转型
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }
        usb.closeDevice();
    }
}
