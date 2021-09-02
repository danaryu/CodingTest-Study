package com.hello.algo.level1;

public class GetDotProduct {

    public static void main(String[] args) {

        int[] lottos = {1, 2, 3, 4};
        int[] signs  = {-3, -1, 0, 2};

        System.out.println(solution(lottos, signs));

    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i=0 ; i<a.length ; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

}
