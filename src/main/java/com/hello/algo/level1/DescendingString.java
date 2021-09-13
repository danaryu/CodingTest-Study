package com.hello.algo.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class DescendingString {
    public static void main(String[] args) {
        String s ="Zabcdefg";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new StringBuilder(new String(chars)).reverse().toString();

    }
}
