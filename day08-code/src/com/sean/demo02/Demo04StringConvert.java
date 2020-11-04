package com.sean.demo02;
/*
* String当中与转换相关的常用方法有：
*
* public char[] toCharArray(); 将当前字符串拆分成字符数组并返回
* public byte[] getBytes(); 将当前字符串拆分成字符对应的byte字节码数组并返回
* public String replace(charSequance oldString, charSequance newString);
* 备注：charSequance意思就是说可以接收字符串类型
* */
public class Demo04StringConvert {
    public static void main(String[] args) {
        //将当前字符串拆分成字符数组并返回
        char[] chars = "ABCD".toCharArray();
        System.out.println(chars);
        System.out.println(chars[0]);
        System.out.println(chars.length);

        //将当前字符串拆分成字符对应的byte字节码数组并返回
        byte[] bytes = "abcd".getBytes();
        System.out.println(bytes[0]);
        System.out.println(bytes.length);

        //替换字符串
        String str1 = "HelloWorld";
        String str2 = str1.replace("World","Java");
        System.out.println(str1);//HelloWorld
        System.out.println(str2);//HelloJava

        System.out.println("HelloWorld，HelloWorld，HelloWorld".replace("World","Java"));

    }
}
