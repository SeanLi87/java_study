package com.sean.demo05;
/*
* 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
* 那么这种情况下就可以什额攻略掉该类的定义，而改为使用【匿名内部类】
*
* 匿名内部类的定义格式：
* 接口名称 对象名 = new 接口名称() {
*       //覆盖重写所有抽象方法
* }
*
* 对匿名内部类的格式进行解析
* 1. new代表创建对象的动作
* 2. 接口名称就是匿名内部类需要实现哪个接口
* 3. {...}这才是匿名内部类的内容
*
* 注意事项
* 1. 匿名内部类的实现，在【创建对象】的时候，只能使用唯一一次，若需要复用则需要重复拷贝匿名内部类方法
* 因此如果希望多次创建对象，而类的内容一样的话，那么就建议单独定义实现类
* 2. 匿名对象，在【调用方法】的时候，只能调用唯一一次。
* 如果希望同一个对象，调用多次方法，那么必须给对象起个名字。
* 3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
*
* 强调，匿名类和匿名对象不是一回事！！！
* */
public class DemoMain {

    public static void main(String[] args) {
//        MyInterface obj1 = new MyInterfaceImpl();
//        obj1.method1();

        //使用匿名内部类
        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类方法执行，111-A");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类方法执行，222-A");
            }
        };
        objA.method1();
        objA.method2();

        //使用匿名内部类+匿名对象
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类方法执行，111-A");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类方法执行，222-A");
            }
        };


    }



}
