package com.hello.algo.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MathPlayer {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println(solution(array));


    }

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] player1 = {1,2,3,4,5};
        int[] player2 = {2,1,2,3,2,4,2,5};
        int[] player3 = {3,3,1,1,2,2,4,4,5,5};

        int count1 = 0, count2 = 0, count3 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 6번째 문제일 때 player1은 어떻게 처리? 다시 0부터...
        // player1 : i%5
        // player2 : i%8
        // player3 : i%10
        for (int i=0 ; i<answers.length ; i++) {

            int i1 = player1[i%5];
            int i2 = player2[i%6];
            int i3 = player3[i%8];

            if(answers[i] == i1) count1++;
            if(answers[i] == i2) count2++;
            if(answers[i] == i3) count3++;
        }

        int max = Math.max(Math.max(count1, count2), count3);

        if(max == count1) list.add(1);
        if(max == count2) list.add(2);
        if(max == count3) list.add(3);

        answer = new int[list.size()];

        if(list.isEmpty()) return new int[]{1,2,3};

        for (int i=0 ; i<answer.length ; i++) {
            answer[i] = list.get(i);
            System.out.println("answer[i] = " + answer[i]);
        }
        return answer;

    }

}
