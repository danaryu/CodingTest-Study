package com.hello.algo.level1;

import java.util.ArrayList;

public class NoMoreSameNumber {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,2,3,3,4};
        System.out.println(solution(arr));

    }

    public static int[] solution(int[] arr) {

        ArrayList<Integer> array = new ArrayList();
        array.add(arr[0]);

        for (int i=1; i<arr.length ; i++) {
            if (arr[i] != arr[i-1]) array.add(arr[i]);
        }

        int[] answer = new int[array.size()];
        for (int i=0; i<array.size() ; i++){
            answer[i] = array.get(i);
            System.out.println("answer[i] = " + answer[i]);
        }

        return answer;
    }

}
