package com.hello.algo.programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class SortingString {

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;
        System.out.println(solution(strings, n));
    }

    public static String[] solution(String[] strings, int n) {
        // String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) < o2.charAt(n)) return -1;
                else if (o1.charAt(n) > o2.charAt(n)) return 1;
                else {
                    return o1.compareTo(o2);
                }
            }
        });

        for (String str : strings) System.out.println("str = " + str);

        return strings;
    }

}
