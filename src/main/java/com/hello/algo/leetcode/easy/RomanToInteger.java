package com.hello.algo.leetcode.easy;


/*
    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

 */
public class RomanToInteger {

    /*
        Runtime: 3 ms, faster than 99.78% of Java online submissions for Roman to Integer.
        Memory Usage: 38.7 MB, less than 98.70% of Java online submissions for Roman to Integer.
     */
    public static int romanToInt(String s) {

        int pointer = 0;
        int sum = 0;

        while(pointer < s.length()) {
            // System.out.println("pointer = " + pointer);

            if(s.charAt(pointer) == 'I') {
                if (pointer + 1 < s.length()) {
                    if (s.charAt(pointer + 1) == 'V') {
                        sum += 4;
                        pointer += 2;
                        continue;
                    }
                    if (s.charAt(pointer + 1) == 'X') {
                        sum += 9;
                        pointer += 2;
                        continue;
                    }
                }
                sum += 1;
                pointer++;
                continue;
            }

            if(s.charAt(pointer) == 'X') {
                if (pointer + 1 < s.length()) {
                    if (s.charAt(pointer + 1) == 'L') {
                        sum += 40;
                        pointer += 2;
                        continue;
                    }
                    if (s.charAt(pointer + 1) == 'C') {
                        sum += 90;
                        pointer += 2;
                        continue;
                    }
                }
                sum += 10;
                pointer++;
                continue;
            }

            if(s.charAt(pointer) == 'C') {
                if (pointer + 1 < s.length()) {
                    if (s.charAt(pointer + 1) == 'D') {
                        sum += 400;
                        pointer += 2;
                        continue;
                    }
                    if (s.charAt(pointer + 1) == 'M') {
                        sum += 900;
                        pointer += 2;
                        continue;
                    }
                }
                sum += 100;
                pointer++;
                continue;
            }

            // System.out.println("sum = " + sum);

            if(s.charAt(pointer) == 'V') sum += 5;
            if(s.charAt(pointer) == 'L') sum += 50;
            if(s.charAt(pointer) == 'D') sum += 500;
            if(s.charAt(pointer) == 'M') sum += 1000;

            // System.out.println("sum2 = " + sum);

            pointer++;
        }

        return sum;
    }

    public static int romanToInt2(String s) {
        int nums[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'M':
                    nums[i] = 1000;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'X' :
                    nums[i] = 10;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'I':
                    nums[i] = 1;
                    break;
            }
        }

        int sum=0;

        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] < nums[i+1])
                sum -= nums[i];
            else
                sum += nums[i];
        }
        return sum + nums[nums.length-1];
    }


    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt2(s));
    }

}
