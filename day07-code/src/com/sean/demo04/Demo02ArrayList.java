package com.sean.demo04;
/*
* 背景：数组的长度不可以发生改变
* 但是ArrayList集合长度可以随意发生变化
*
* 对于ArrayList来说，有一个尖括号<E>代表泛型
* 泛型：就是装在集合中的所有元素，都是同一类的什么类型
* 注意：泛型只能是引用类型，不能是基本类型
*
* 注意事项：
* 1.对于ArrayList来说，直接打印的不是地址值而是内容[xx,xx,xx]
* 2.如果内容是空，得到的是空的中括号：[]
*
* */
import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里面装的全是String字符串类型的数据
        //备注：从java1.7开始，右侧尖括号里可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加一些数据，需要使用add()方法
        list.add("小王");
        list.add("小李");
        list.add("小明");
        list.add("小张");
        System.out.println(list);//[小王, 小李, 小明, 小张]

    }
}
