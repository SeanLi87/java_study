package com.sean.demo14;

import java.util.ArrayList;

public class Demo01RedPack {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);
        manager.showAccount();
        one.showAccount();
        two.showAccount();
        three.showAccount();

        System.out.println("============");
        ArrayList<Integer> redPack = manager.sendRedPack(1000, 3);
        one.receivePack(redPack);
        two.receivePack(redPack);
        three.receivePack(redPack);
        manager.showAccount();
        one.showAccount();
        two.showAccount();
        three.showAccount();
    }
}
