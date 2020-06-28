package com.sean.demo01;

public class Demo02Student {
/*1.

    */
/*创建实例化一个类的步骤
* 1.导包。格式为 import 包名.类名
*   import com.sean.demo01.Student
* 2.创建对象，类名 对象名=new 类名（）
* 3.调用成员变量，对象名.成员变量
*   注意，成员变量会按照new的规则进行默认值赋值，参见不同类型的数组默认值
* 4.调用成员方法，对象名.成员方法(参数)*/

    public static void main(String[] args) {
        Student stu = new Student();
//        System.out.println(stu.name);
//        System.out.println(stu.age);
//        stu.eat();
//        stu.sleep();
//        stu.study();
//        stu.name = "小明";
//        stu.age = 18;
//        System.out.println(stu.name);
//        System.out.println(stu.age);
        Student A = stu;
        Student B = stu;
        System.out.println("旧的"+"stu地址"+stu);
        System.out.println("A地址"+A+"   B地址"+B);
        stu = new Student();
        System.out.println("新的stu地址"+stu);
        System.out.println("A地址"+A+"   B地址"+B);

}


}
