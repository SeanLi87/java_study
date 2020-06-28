package com.sean.demo01;
/*
* 直接打印数组名字得到数组的内存地址哈希值，16进制
*
* 访问数组元素的格式，数组名称[索引值]
* 索引值，就是一个int数字，代表数组中元素的编号
* [索引值]从0开始，直到数组个数-1为止*/
public class Demo02ArrayUse {
    public static void main(String[] args) {
        //静态初始化数组
        int[] array = {1,2,3};
        System.out.println(array);//得到数组的内存地址 [I@60e53b93
        System.out.println(array[0]);//得到数组的元素
        System.out.println(array[1]);//得到数组的元素
        System.out.println(array[2]);//得到数组的元素

        array[1] = 10;
        array[2] = 20;
        System.out.println(array);//地址不会改变
        System.out.println(array[0]);//第一个元素不会改变
        System.out.println(array[1]);//第二个元素已经改变
        System.out.println(array[2]);//第三个元素已经改变
    }
}
