package com.hello.algo.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RecommendJob {

    public static void main(String[] args) {

        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] languages = {"JAVA", "JAVASCRIPT"};
        int[] preferences = {7,5};

        System.out.println(solution(table, languages, preferences));

    }

    public static String solution(String[] table, String[] languages, int[] preference) {

        String answer = "";
        HashMap<String, Integer> preferLanguages = new HashMap<String, Integer>();
        ArrayList<String> list = new ArrayList<>();
        int maxPrefer = 0;

        for (int i=0 ; i<preference.length ; i++) {
            preferLanguages.put(languages[i], preference[i]);
        }

        // 직업군 별 점수 식 // 언어선호도 * 직업군 언어 점수
        // table[i]의 첫번째 단어 : 직업군

        for (int i=0 ; i<table.length ; i++) {
            int score = 0;
            String[] jobsAndLang = table[i].split(" ");
            String job = jobsAndLang[0];
            System.out.println("job = " + job);
            for (int j=5 ; j>=1 ; j--) {
                // 1점~5점 : 꼴등부터 ~ 6-j (직업군 언어 점수)
                String language = jobsAndLang[j];
                //C# 일 때 --> C# 을 preferLanguages에서 검색해서, 선호도를 가져온다.
                // (선호도)
                Integer prefer = preferLanguages.getOrDefault(language, 0);
                score += (6-j) * prefer;

                System.out.println("language = " + language + ", score = " + score);
            }

            if (maxPrefer < score) {
                list.clear();
                maxPrefer = score;
                list.add(job);
            } else if (maxPrefer == score) {
                list.add(job);
            }

            Collections.sort(list);

        }

        return list.get(0);
    }

}
