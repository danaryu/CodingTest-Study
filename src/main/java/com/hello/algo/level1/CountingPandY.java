package com.hello.algo.level1;

import java.util.HashMap;

public class CountingPandY {

    public static void main(String[] args) {
        String s = "pabc";
        System.out.println(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = true;
        HashMap<Character, Integer> map = new HashMap<>();

        s = s.toLowerCase();
        for (char current : s.toCharArray()) {
            map.put(current, map.getOrDefault(current, 0)+1);
        }

        int pCount = map.getOrDefault('p', 0).intValue();
        int yCount = map.getOrDefault('y', 0).intValue();

        if (pCount == 0 && yCount == 0) return true;

        if (pCount == yCount) return true;
        else if (pCount != yCount) return false;

        return answer;
    }

}
