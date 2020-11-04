package com.sean.demo01;
/*
* final关键字代表最终，不可改变
*
* 常见的四种用法
* 1.可以用来修饰一个类
* 2.可以用来修饰一个方法
* 3.还可以用来修饰一个局部变量
* 4.还可以用来修饰一个成员变量
*
* */
public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);


        //一旦用final来修饰局部变量，那么这个变量就不能进行更改
        final int num2 = 200;
        System.out.println(num2);

//        num2 = 250;//错误写法，只能进行唯一一次赋值！
//        num2 = 200;//错误写法，只能进行唯一一次赋值！

        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        final Student stu2 = new Student("高圆圆");
        //错误写法，final的引用类型变量，其中的地址值不可改变
//        stu2 = new Student("赵又廷");//错误写法
        System.out.println(stu2.getName());
        stu2.setName("高园园园园园");
        System.out.println(stu2.getName());


    }


}
