package com.sean.demo02;
/*
 * 问题描述：定义person年龄时，无法阻止不合理的数值设置进来
 * 解决方案：用private关键字将需要保护的成员变量进行修饰
 *
 * 一旦使用了private进行修饰，那么本类中仍然可以随意使用
 * 但是，超出本类范围之外不能再直接访问
 *
 * 间接访问private成员变量，就是定义一对getter，setter方法
 * 格式getXxx,setXxx
 * 对于getter来说，不能有参数，返回值类型和成员变量一致
 * 对于setter来说，不能有返回值，参数类型和成员变量一致
 */
public class Person {
    private String name;
    private int age;

    public void show() {
        System.out.println("我叫"+name+"，年龄"+age);
    }
    public void setAge(int num) {
        if (num > 0 & num <100){
            age = num;
        }
        else {
            System.out.println("错误的年龄数据");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String na) {
        name = na;
    }
}
