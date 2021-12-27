package com.hello.algo.programmers.level1;

public class CalculateMoney {

    public static void main(String[] args) {
    int price = 3, money = 20, count = 4;
        System.out.println(solution(price, money, count));
    }

    public static long solution(int price, int money, int count) {
        return Math.max(price * count * (count + 1) / 2 - money, 0);
    }


}
