package com.sean.demo04;
/*
* 题目：
* 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
*
*
* 思路：
* 1.获取-10.8到5.9之间的整数边界，首先对-10.8向上取整，然后对5.9向下取整
* 2.循环第一步的整数范围中的所有整数，转换成绝对值后判断是否大于6或者小于2.1，符合条件的就增加到计数器中
* 3.打印计数器
* */
public class Demo04MathPractise {
    public static void main(String[] args) {
        int min = (int)Math.ceil(-10.8);
        System.out.println(min);
        int max = (int)Math.floor(5.9);
        System.out.println(max);
        int counter=0;
        for (int i = min; i <=max; i++){
            int absNum = Math.abs(i);
            if (absNum >6 || absNum <2.1){
                System.out.println(i);
                counter++;
            }
            else {
                System.out.println("不符合条件");
            }
        }
        System.out.println(counter);
    }
}
