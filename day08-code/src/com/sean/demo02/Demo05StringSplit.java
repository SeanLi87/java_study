package com.sean.demo02;
/*
* 分割字符串的方法：
* public String[] split(String regex); 按照参数的规则，将字符串切成若干部分
*
* 注意事项：
* split的参数其实是一个正则表达式，今后学习
* 今天要注意：如果按照英文的.进行切分数组，需要加\\.(两个反斜杠)
* */
public class Demo05StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=============");

        String str2 = "zzz yyy xxx";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=============");

        String str3 = "AAA.BBB.CCC";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }



    }
}
