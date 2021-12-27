package com.hello.algo.programmers.level1;

public class SimpleString {

    public static void main(String[] args) {
        String s = "a234";
        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) return s.matches("^[0-9]*$");
        return false;
    }

}
