package com.sean.demo02;
/*
*String当中与“获取”相关的常用方法有
*
* public int length(); 获取字符串的字符个数，返回字符串长度。
* public String concat(String str);将当前字符串和参数字符串拼接成为新的字符串并返回
* public char charAt(int index);获取字符串中指定索引位置的字符（索引从0开始）
* public index indexOf(String str);查找参数字符串在本字符串中第一次出现的索引位置，如果没有返回-1值
* */
public class Demo02StringGet {

    public static void main(String[] args) {
        //获取字符串长度
        String str1 = "abcdsadasdsad";
        int length = str1.length();
        System.out.println("字符串长度为："+length);

        //拼接字符串
        String str2 = "Hello";
        String str3 = "World";
        String str4 = str2.concat(str3);
        System.out.println("拼接后的字符串为："+str4);//HelloWorld

        //获取字符串中指定索引位置的字符
        char ch = str4.charAt(2);
        System.out.println("HelloWrold中索引为2的字符为："+ch);

        //查找参数字符串在本字符串中第一次出现的索引位置
        int index = str4.indexOf("Wor");
        System.out.println("Wor在HelloWorld中第一次出现的位置为："+index);
        System.out.println("abcd".indexOf("xxx"));
    }
}
