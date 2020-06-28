package com.sean.demo02;

public class Demo04Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.show();
        student.setAge(18);
        student.setMale(true);
        student.setName("小明");
        student.show();

        String test = "ABCD";
        String test1 = test;
        String test2 = "ABCD";
        System.out.println(test + test.hashCode());
//        test.toLowerCase();
        System.out.println(test1 + test1.hashCode());
        System.out.println(test2 + test2.hashCode());
    }
}
