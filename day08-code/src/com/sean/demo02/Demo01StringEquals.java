package com.sean.demo02;
/*
* ==是进行字符串的地址比较，如果需要比较字符串的内容，可以使用两个方法
*
* public boolean equals(Object object);参数是可以使用任何对象，只有参数是一个字符串并且内容相同的才会给true，否则返回false。
* 注意事项：
* 1.任何对象都能用Object接收
* 2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)一样
* 3.如果比较双方一个变量一个常量，推荐把常量字符串写在前面。
* 推荐："abc".equals(str)    不推荐str.equals("abc")
*
* public boolean equalsIgnoreCase(String str); 忽略英文字母大小写进行内容比较
*
* */
public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println("abc".equals(str2));//true
        System.out.println(str2.equals("abc"));//true

        System.out.println("===============");
        String str4 = null;
        System.out.println("abc".equals(str4));//推荐，false
//        System.out.println(str4.equals("abc"));//不推荐，报空指针，因为null没有地址值

        System.out.println("===============");
        String str5 = "Java";
        String str6 = "java";
        System.out.println(str5.equals(str6));//false
        System.out.println(str5.equalsIgnoreCase(str6));//true
        //自动拆箱成int类型？因此不算object类型？
        Integer one = new Integer(1);
        Integer two = new Integer(1);
        System.out.println(one.equals(two));
        System.out.println(one);

    }
}
