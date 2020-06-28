package com.sean.demo04;

import java.util.ArrayList;

/*
 * ArrayList当中常用的方法有
 *
 * public boolean add(E e) {}：向集合当中添加元素，参数的类型和泛型一致，返回值代表添加是否成功
 *   备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用
 *       但是对于其他集合来说，添加动作不一定成功
 * public E get(int index) {}：获取集合当中的元素，参数是索引值，返回索引对应位置的元素
 * public E remove(int index) {}：删除集合当中的元素，参数是索引值，返回删除的元素
 * public int size() {}：获取集合的长度
 * */
public class Demo03ArrayMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean isSuccess = list.add("小王");
        System.out.println("元素是否添加成功？" + isSuccess);
        System.out.println("列表" + list);
        list.add("小李");
        list.add("小明");
        list.add("小张");

        //获取集合中索引值为2的元素
        String name = list.get(2);
        System.out.println("索引值为2的人是：" + name);

        //删除索引值为3的元素
        String whoIsRemoved = list.remove(3);
        System.out.println("索引值为3的人被删掉了：" + whoIsRemoved);

        //获取ArrayList的长度
        int size = list.size();
        System.out.println("集合的长度：" + size);

    }
}
