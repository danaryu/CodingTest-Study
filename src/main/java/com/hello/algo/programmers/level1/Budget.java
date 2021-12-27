package com.hello.algo.programmers.level1;

import java.util.Arrays;

public class Budget {

    public static void main(String[] args) {

        int[] d = {3,1,2,5,4};
        int budget = 9;

        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;

        if (d.length == 1) {
            if (d[0] < budget) return 1;
            else return 0;
        }

        Arrays.sort(d);

        // 최대 지원해줄 수 있는 부서의 개수 구하기
        for (int i=0 ; i<d.length ; i++) {
            if (sum <= budget) {
                budget -= d[i];
                count++;
            }
        }

        return count;
    }

}
