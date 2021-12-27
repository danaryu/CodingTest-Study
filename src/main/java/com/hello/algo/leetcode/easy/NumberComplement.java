package com.hello.algo.leetcode.easy;

class NumberComplement {
    public static int findComplement(int num) {
        // 0 -> 1로, 1 -> 0으로 바꾸면 되는 문제
        String s = Integer.toBinaryString(num);
        String a = s.replace('0', 'a').replace('1', 'b').replace('a', '1').replace('b', '0');
        int i = Integer.parseInt(a, 2);
        return i;
    }

    public static void main(String[] args) {

        int number = 5;
        System.out.println(findComplement(number));
    }
}