package com.sean.demo02;

public class Demo05MethodPractice {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;
        System.out.println( num1 + "和" + num2 + "是否相等？：" + isSame(num1,num2));

    }
/*
方法定义三要素：
1.返回值类型: boolean
2.方法名称: isSame
3.参数列表: int a, int b
*/
    public static boolean isSame(int a, int b) {
//        if (a == b) {
//            return true;
//        }
//        else {
//            return false;
//        }
        return a == b;
    }
}
