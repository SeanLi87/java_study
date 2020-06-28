package com.sean.demo03;

import java.util.Random;
import java.util.Scanner;

/*
数字游戏：随机生成一个0~100的数字，然后从键盘输入一个数字进行猜测，若猜中，则提示游戏结束
* 思路：
* 1.随机生成一个0~100数字
* 2.从键盘获取一个数字
* 3.若两者相等，则提示游戏结束
* 4.若两者不相等，则提示错误，重新猜测,循环2~4步骤
* */
public class Demo04RandomGame {
    public static void main(String[] args) {
        int ranNum = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        //无限猜测次数
//        while (true) {
//            System.out.println("请猜一个数字：");
//            int guess = sc.nextInt();
//            if (guess > ranNum) {
//                System.out.println("猜错啦，太大了！");
//            } else if (guess < ranNum) {
//                System.out.println("猜错啦，太小了！");
//            } else {
//                System.out.println("猜测正确,游戏结束");
//                break;
//            }
//        }
        //有限10次猜测次数
        for (int i = 0; i < 10; i++) {
            System.out.println("请猜一个数字：");
            int guess = sc.nextInt();
            if (guess > ranNum) {
                System.out.println("猜错啦，太大了！" + "剩余：" + (10 - i -1) + "次");
            } else if (guess < ranNum) {
                System.out.println("猜错啦，太小了！" + "剩余：" + (10 - i -1) + "次");
            } else {
                System.out.println("猜测正确,游戏结束");
                break;
            }
        }
    }
}
