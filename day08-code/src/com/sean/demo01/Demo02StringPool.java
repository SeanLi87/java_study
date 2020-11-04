package com.sean.demo01;

/*
* 字符串常量池，程序当中写上的双引号字符串，就在常量池中
*
* 对于基本类型来说，==是进行数值的比较
* 对于引用类型爱说，==是进行【地址值】的比较
* */

public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";

        char[] charArray = {'A','B','C'};
        String str3 = new String(charArray);

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
