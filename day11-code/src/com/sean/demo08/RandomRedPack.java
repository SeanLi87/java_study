package com.sean.demo08;

import java.util.ArrayList;
import java.util.Random;

public class RandomRedPack {

    public static void dividePack(int totalMoney, int totalCount) {
        /*
         *
         * 原则：每一次获取的金额不超过剩下金额的平均值*2，最小值为1
         * 比如一共100元，第一次的随机金额为1~66
         * 第二次获取的金额为1~（剩下金额/剩下次数）*2
         * 因此，每一次获取的金额为[1 ~ (leftmoney/leftcount) *2)
         * 最后一次不随机，直接获取
         * */
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            if (leftCount >= leftMoney) {
                list.add(1);
                //剩余随机次数-1
                leftCount--;
                //剩余金额减去随机金额
                leftMoney -= 1;
            } else {
                //获取随机金额
                int money = r.nextInt((leftMoney / leftCount) * 2) + 1;
                //将随机金额存入list
                list.add(money);
                //剩余随机次数-1
                leftCount--;
                //剩余金额减去随机金额
                leftMoney -= money;
            }

        }
        list.add(leftMoney);

        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        dividePack(101, 100);
//        System.out.println(97/98);
    }

}
