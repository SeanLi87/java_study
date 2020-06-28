package com.sean.demo04;
/*
* 题目：
* 定义一个数组,用来存储三个对象
*
* 数组有一个缺点：一旦创建，程序运行期间数组长度不可改变
* */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为三的数组,里面用来存储Person类型的对象
        Person[] arrayA = new Person[3];
        //引用类型初始值为null
        System.out.println(arrayA[0]);
        //创建三个对象
        Person one = new Person("小明",12);
        Person two = new Person("小王",13);
        Person three = new Person("小李",14);
        //将对象地址赋值给数组元素
        arrayA[0] = one;
        arrayA[1] = two;
        arrayA[2] = three;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

    }
}
