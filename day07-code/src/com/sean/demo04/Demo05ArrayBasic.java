package com.sean.demo04;

import java.util.ArrayList;
/*
* 如果希望向ArrayList集合中添加基本类型数据时，需要使用“包装类”
*
* 基本类型      包装类（引用类型，包装类都位于java.lang下）
* byte      Byte
* short     Short
* int       Integer 【特殊】
* long      Long
* float     Float
* double    Double
* char      Character 【特殊】
* boolean   Boolean
*
* 从JDK1.5开始，支持自动装箱，自动拆箱
* 自动装箱：基本类型-->包装类型，比如add()方法的参数直接使用int类型时，ArrayList能够自动将其转换成包装类型Integer
* 自动拆箱：包装类型-->基本类型，比如get()方法的返回值可以直接使用int类型进行接收
* */
public class Demo05ArrayBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        int num = 200;
        //自动装箱
        list.add(num);
        System.out.println(list);
        //自动拆箱
        int result = list.get(1);
        System.out.println(result);
    }
}
