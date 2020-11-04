package com.sean.demo14;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int amount) {
        super(name, amount);
    }

    public ArrayList<Integer> sendRedPack(int totalMoney, int count) {
        if (super.getAmount()<totalMoney){
            System.out.println("账户余额不足");
            return null;
        }
        //余额充足时，先减去红包总额
        super.setAmount(super.getAmount() - totalMoney);
        //计算每个红包金额
        ArrayList<Integer> list = new ArrayList<>();
        int avgMoney = totalMoney / count;
        int restMoney = totalMoney % count;
        for (int i = 0; i < count - 1; i++) {
            list.add(avgMoney);
        }
        //最后一个红包加上余数
        list.add(avgMoney+restMoney);
        return list;
    }
}
