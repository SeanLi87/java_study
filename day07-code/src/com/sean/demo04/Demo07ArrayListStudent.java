package com.sean.demo04;

import java.util.ArrayList;

/*
 * 自定义4个学生对象，添加到集合并且遍历
 * 1.新建一个ArrayList集合，类型为Student
 * 2.创建4个学生对象
 * 3.将学生对象添加到集合中
 * 4.遍历集合
 * */
public class Demo07ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("小明", 12, true);
        Student two = new Student("小王", 13, false);
        Student three = new Student("小李", 14, true);
        Student four = new Student("小张", 15, true);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        }

    }

}
