package com.hello.algo.programmers.level1;

import java.util.ArrayList;

public class SecondWeek {

    public static void main(String[] args) {

        int[][] scores = {{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67}, {61,57,100,80,65},{24,90,94,75,65}};
        System.out.println(solution(scores));
    }

    public static String solution(int[][] scores) {
        String answer = "";

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int[] abs = new int[scores.length];

        // int[i][j]
        // i행 j열 : i번 학생이 평가한 j번 학생의 과제 점수
        // 각 학생들이 받은 점수의 평균을 구하여, 기준에 따라 학점을 부여
        // 자기 자신을 평가한 점수가 유일한 최고점 또는 유일한 최저점 일 경우 제외 i==j가 max, min일 경우 빼고
        // 0번 학생부터 순서대로
        // scores[i] <- i가 바뀔때마다 abs[i]에 저장되어야 함
        for (int j=0 ; j<scores.length ; j++) {

            int max = 0, min = Integer.MAX_VALUE;

            for (int i=0 ; i< scores.length ; i++) {
                int score = scores[i][j];
                min = Math.min(score, min);
                max = Math.max(score, max);

                abs[j] += score;
                list.add(score);

            }

            int onlyValue = scores[j][j];

            if (onlyValue == max) {
                if(list.indexOf(onlyValue) == list.lastIndexOf(onlyValue)) {
                    list.remove(list.indexOf(onlyValue));
                    abs[j] -= onlyValue;
                }
            } else if (onlyValue == min) {
                if(list.indexOf(onlyValue) == list.lastIndexOf(onlyValue)) {
                    list.remove(list.indexOf(onlyValue));
                    abs[j] -= onlyValue;
                }
            }

            answer = getGrade(answer, list, abs, j);

            list.clear();
        }


        return answer;
    }

    private static String getGrade(String answer, ArrayList<Integer> list, int[] abs, int j) {
        switch(abs[j]/ list.size()/10) {
            case 10:
            case 9:
                answer += "A";
                break;
            case 8:
                answer += "B";
                break;
            case 7:
                answer += "C";
                break;
            case 6:
            case 5:
                answer += "D";
                break;
            default:
                answer += "F";
                break;
        }
        return answer;
    }

}
