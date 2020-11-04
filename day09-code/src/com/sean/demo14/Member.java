package com.sean.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int amount) {
        super(name, amount);
    }

    public void receivePack(ArrayList<Integer> list) {
        //如果红包为空，则退出
        if (list == null){
            System.out.println("红包为空");
            return;
        }
        //若红包不为空，从红包中随机挑选一个
        int num = new Random().nextInt(list.size());
        //将获取到的红包删除
        super.setAmount(list.remove(num)+super.getAmount());
    }
}
