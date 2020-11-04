package com.sean.demo14;

import java.util.ArrayList;

public class User {
    private String name;
    private int amount;

    public User() {
    }

    public User(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void showAccount() {
        System.out.println(this.name+"当前账户余额为："+this.amount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
