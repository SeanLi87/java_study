package com.sean.demo05;

import java.util.Map;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void method1() {
        System.out.println("实现类覆盖重写了方法，111");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写了方法，222");
    }
}
