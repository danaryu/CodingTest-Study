package com.hello.algo.programmers.level2;

import java.util.Locale;
import java.util.StringTokenizer;

public class MakeJadenCase {

    public static void main(String[] args) {

        String s = "3people   unFollowed me ";
        System.out.println(solution(s));

    }

    public static String solution(String s) {
        // 1. " " 기준으로 split || StringTokenizer
        // 2. 첫 글자가 문자인 경우, 대문자로 바꾼다.
        // 3. 이어붙인다.

        StringBuffer sb = new StringBuffer();

        String[] letters = s.split(" ", -1);

        for (int i=0 ; i<letters.length ; i++) {
            String letter = letters[i].toLowerCase();
            System.out.println("str = " + letter);

            if (!letter.isEmpty()) {
                char[] chars = letter.toCharArray();
                if (Character.isLetter(chars[0])) chars[0] = Character.toUpperCase(chars[0]);
                letters[i] = String.valueOf(chars);
            }

            sb.append(letters[i]);

            if (i != letters.length -1) sb.append(' ');
        }

        return String.valueOf(sb);
/*
        StringTokenizer st = new StringTokenizer(s, " ");

        for (int i = 0 ; st.hasMoreTokens() ; i++) {
            System.out.println("st.nextToken() = " + st.nextToken());
        }
*/
    }

}
