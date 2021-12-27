package com.hello.algo.programmers.level1;

public class SumBetweenNumbers {

    public static void main(String[] args) {
        int a = 3, b = 5;

        System.out.println(solution(a, b));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for(int i = min ; i<=max; i++) {
            answer += i;
        }
        return answer;
    }

}
