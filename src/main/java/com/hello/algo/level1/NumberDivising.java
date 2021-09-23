package com.hello.algo.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberDivising {

    public static void main(String[] args) {

        int[] arr = {3,2,6};
        int divisor = 10;
        System.out.println(solution(arr, divisor));
    }

        public static int[] solution(int[] arr, int divisor) {

            ArrayList<Integer> arrayList = new ArrayList();

            for (int a : arr) if (a % divisor == 0) arrayList.add(a);
            Collections.sort(arrayList);

            if (arrayList.size() <= 0) return new int[]{-1};
            int[] answer = new int[arrayList.size()];
            for (int i=0 ; i<arrayList.size() ; i++) answer[i] = arrayList.get(i);
            return answer;
        }


    }
