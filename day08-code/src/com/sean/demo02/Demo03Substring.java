package com.sean.demo02;
/*
* 字符串的截取方法
*
* public String substring(int index); 截取从参数位置一直到字符串末尾，返回新字符串
* public String substring(int begin,int end);截取字符串从参数begin到end，返回新字符串
* [),截取范围左闭右开，包含左边，不包含右边
* */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);//World

        String str3 = str1.substring(4,7);
        System.out.println(str3);//owo

        //下面这种写法，字符串的内容仍然是没有改变的
        //下面有两个字符串："Hello","Java"
        //strA中首先保存的是"Hello"的地址值
        //然后重新保存了"Java"的地址值
         String strA = "Hello";
        System.out.println(strA);
        strA = "Java ";
        System.out.println(strA);
    }
}
