package com.sean.demo03;
/*
* 构造方法就是创建对象的方法，其中使用格式就是：类名 对象名 = new 构造方法名();
* 注意事项
* 1.构造方法名称必须和所在类完全一样，包含大小写也必须一样
* 2.构造方法不能些返回值类型；连void都不能写
* 3.构造方法不能return一个具体的返回值
* 4.如果没有编写构造方法，那么编译器会默认赠送一个无参数,无方法体的构造方法
*   public Student() {}
* 5.一旦编写了至少一个构造方法，编译器不再赠送
* */

public class Student {
    private String name;
    private int age;

    //无参数的构造方法
    public Student() {
        System.out.println("无参数构造方法执行了");
    }

    //全参数(包含了所有的成员变量)的构造方法
    public Student(String name, int age) {
        System.out.println("全参构造方法执行了");
        this.age = age;
        this.name = name;
    }

    //getter/setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
