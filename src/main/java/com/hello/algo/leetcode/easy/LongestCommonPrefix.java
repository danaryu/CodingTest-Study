package com.hello.algo.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // 공통의 Prefix 구하기
        // 접근
        HashMap<String, Integer> map = new HashMap<>();

        String standardString = strs[0];

        for(int i = 1 ; i < standardString.length() + 1 ; i++) {
            String substring = standardString.substring(0, i);
            map.put(substring, substring.length());
        }

        int max = 200;
        for(int j = 1 ; j < strs.length ; j++) {
            String str = strs[j];
            int targetMax = 0;
            for(int i = 1 ; i < str.length() + 1 ; i++) {
                String targetString = str.substring(0, i);
                if(map.containsKey(targetString) && map.get(targetString) > targetMax) {
                    targetMax = map.get(targetString);
                }
            }
            max = Math.min(targetMax, max);
        }

        return max == 0 ? "": standardString.substring(0, max);
    }

    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }

    public static String longestCommonPrefix3(String[] strs) {
        String prefix = strs[0];
        for(int index=1;index<strs.length;index++){
            while(strs[index].indexOf(prefix) != 0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        //String[] strs = {"dog","racecar","car"};
        String[] strs = {"flower","flow","floeee", "flox", "flowmer"};
        System.out.println(longestCommonPrefix3(strs));
    }

}
