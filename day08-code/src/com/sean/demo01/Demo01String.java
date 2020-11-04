package com.sean.demo01;

/*
 * java.lang.String代表字符串类
 * API文档当中说,Java程序中所有字符串字面值（如，"abc"）都作为此类的实例实现
 * 其实是说，程序当中所有双引号字符串，都是String类的对象。（就算没有new，也照样是）
 *
 * 字符串的特点：
 * 1. 字符串的内容永不可变【重点】
 * 2. 正因为字符串不可变，因此可以在内存中共享使用，只要字符串内容相同
 * 3. 字符串效果相当于是char[]字符数组，但底层原理是byte[]字节数组，存储了每个字符的二进制字节编码
 *
 * 创建字符串的常见3+1种方式
 * 三种构造方法
 * public String();创建一个空字符串
 * public String(Char[] array);根据字符数组的内容，来创建对应的字符串
 * public String(byte[] array);根据字节数组的内容，来创建对应的字符串
 * 一种直接创建
 * String str = "Hello";
 *
 * 注意：直接写上双引号，就是字符串对象（JVM自动new）
 * */
public class Demo01String {
    public static void main(String[] args) {
        //创建一个空字符串
        String str1 = new String();
        System.out.println("第一个字符串：" + str1);

        //根据字符数组的内容，来创建对应的字符串
        char[] charArray = {'a', ' ', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串:" + str2);

        //根据字节数组的内容，来创建对应的字符串
        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串：" + str3);

        //直接创建
        String str4 = "ABC";
        System.out.println("第四个字符串：" + str4);
    }
}
