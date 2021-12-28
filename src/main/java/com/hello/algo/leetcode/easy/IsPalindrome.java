package com.hello.algo.leetcode.easy;

import java.util.HashMap;

public class IsPalindrome {

    public static boolean isPalindrome(int x) {

        char[] chars = String.valueOf(x).toCharArray();

        for(int i = 0 ; i < chars.length/2 ; i++) {
            char standard = chars[i];
            int index = chars.length - i - 1;
            char target = chars[index];

            if (standard != target) return false;
        }
        return true;
    } // 7ms, 38 MB, 72.40%

    public static boolean isPalindrome2(int x) {

        String targetString = String.valueOf(x);
        int i = 0;
        int j = targetString.length() - 1; // 4

        while(i < j) {

            if(targetString.charAt(i) != targetString.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindrome3(int x) {
        if(x < 0 || (x != 0 && x % 10 == 0)) return false;

        int target = 0;

        while(x > target){
            target = target * 10 + x % 10;
            x = x / 10;
        }
        return (x == target || x == target / 10); // 홀수이거나, 짝수이거나
    } // 6ms, 38.2MB, 99.93%

    public static void main(String[] args) {
        int x = 123221;
        System.out.println(isPalindrome3(x));
    }

}
