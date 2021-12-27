package com.hello.algo.programmers.level1;

public class WordOfCenter {

    public static void main(String[] args) {

        String s = "abde";
        System.out.println(solution(s));

    }

    public static String solution(String s) {
        return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
}

