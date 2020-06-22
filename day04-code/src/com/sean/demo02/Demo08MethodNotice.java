package com.sean.demo02;

/*
* 使用方法的注意事项：
* 1.方法定义应该在类中,但是不能在方法中再定义方法.不能嵌套
* 2.方法定义的前后顺序无所谓
* 3.方法定义之后不会执行，必须调用才能执行:单独调用，打印调用，赋值调用
* 4.方法如果有返回值，必须有"return 返回值"
* 5.return后面的数据类型必须和方法定义的返回值类型相同
* 6.对于一个void的方法，不能些return后面的返回值，可以只写return，代表程序结束
* 7.对于void方法最后一个return可以不写
* 8.一个方法中可以有多个return语句，但是需要保证只有一个会被执行*/

public class Demo08MethodNotice {
    public static void main(String[] args) {

    }
    public static int method1(){
        return 10;
    }
    public static void method2() {
        return;
    }
}

