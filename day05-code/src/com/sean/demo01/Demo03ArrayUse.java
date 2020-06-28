package com.sean.demo01;
/*
* 使用动态初始化的时候，所有元素都会初始化默认值
* int则为0
* float则为0.0
* char则为unicode的不可见字符 \u0000
* boolean则为false
* 引用类型则为null
*
* 注意事项：
* 静态初始化也有默认值过程，系统自动马上将大括号中的值进行赋值*/
public class Demo03ArrayUse {
    public static void main(String[] args) {
        //动态初始化
        int[] array = new int[10];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);

        //数组元素赋值
        array[1] = 10;
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
