package com.sean.demo02;

public class Demo06MethodSum {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(sum());

    }

    public static int sum() {
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            result += i;
        }
        return result;
    }

    public static int sum(int end) {
        int result = 0;
        //while循环
//        int i = 0;
//        while (i <= end) {
//            result += i;
//            i ++;
//        }
        //for循环
//        for (int i = 0; i <=end; i ++) {
//            result += i;
//        }
        //do while循环
        int i = 0;
        do {
            result += i;
            i++;
        } while (i <= end);
        return result;
    }
}
