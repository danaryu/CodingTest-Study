package com.hello.algo.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class KthNumber {

    public static void main(String[] args) {

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        System.out.println(solution(array, commands));


    }

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i=0 ; i<commands.length ; i++) {
            int[] command = commands[i];
            int[] list = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(list);
            answer[i] = list[command[2]-1];
        }

        return answer;
    }

/*
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0, comCount = 0;

        for (int[] command : commands) {
            count = 0;
            int i = command[0]-1;
            int j = command[1]-1;
            int k = command[2]-1;

            for ( int a = i ; a <= j ; a++ ) {
                arrayList.add(array[a]);
                count++;
            }

            Collections.sort(arrayList);
            answer[comCount] = arrayList.get(k);

            comCount++;
            arrayList.clear();
        }

        return answer;
    }

*/


}
