package com.hello.algo.programmers.level1;

import java.util.Locale;

public class RecommendId {

    public static void main(String[] args) {

        String id = "...!@BaT#*..y.abcdefghijklm";

        System.out.println("id = " + solution(id));
    }

    public static String solution(String new_id) {
        String answer = "";

        // 1단계
        answer = new_id.toLowerCase(Locale.ROOT);

        // 2단계 : 숫자, 빼기, 밑줄, 마침표만 남긴다
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3단계 : 마침표가 2번이상 연속된 부분을 하나의 마침표로 치환한다
        answer = answer.replaceAll("[.]{2,}", ".");

        // 4단계 : 마침표가 처음이나 끝에 위치한다면 제거한다.
        // answer = answer.replaceAll("^[.]|[.]$","");
        if (answer.startsWith(".")) answer = answer.substring(1);
        if (answer.endsWith(".")) answer = answer.substring(0, answer.length()-1);

        // 5단계 : 빈 문자열이면, a를 대입한다
        if (answer.isEmpty()) answer = "a";

        // 6단계 : 길이가 16자 이상이면, 첫 15개의 문자들을 제외한 나머지들을 제거한다.
        if (answer.length() >= 16) answer = answer.substring(0, 15);
        if (answer.endsWith(".")) answer = answer.substring(0, answer.length()-1);

        // 7단계 : 길이가 2자이하라면, 마지막 문지를 길이가 3이 될 때 까지 반복해서 끝에 붙인다.
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }

}
