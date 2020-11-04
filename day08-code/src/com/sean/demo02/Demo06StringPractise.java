package com.sean.demo02;

/*
 *题目：定义一个方法，把数组{1，2，3}拼接成一个字符串，格式参照如下：[word1#word2#word3]
 *
 * 思路：
 * 1.创建一个数组{1,2,3}
 * 2.创建一个字符串 String str = "["
 * 3.遍历数组，将每个元素的前后拼接上word和#,然后在最开始拼接上str
 * 4.判断最后一个元素，需要拼接word和]符号
 * */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String newString = fromArrayToString(array);
        System.out.println(newString);

    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                String temp = "word" + array[i] + "]";
                str = str.concat(temp);
            } else {

                String temp = "word" + array[i] + "#";
                str = str.concat(temp);
            }
        }
        return str;
    }
}
