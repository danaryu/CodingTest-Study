package com.hello.algo.level1;

import java.util.HashMap;

public class PlusDivisor {

    public static void main(String[] args) {

        int left = 13;
        int right = 17;

        System.out.println(solution(left, right));

    }

    public static int solution(int left, int right) {
        int answer = 0;

        // 제곱수인 경우, 약수의 갯수가 홀수
        // 제곱수인 경우, 약수의 갯수가 짝수
        for (int num=left ; num<=right ; num++) {
            int count = 0;

            if (isNumberEven(num)) answer -= num;
            else answer += num;
        }

        return answer;
    }

    private static boolean isNumberEven(int i) {
        int sqrt = (int) Math.sqrt(i);

        if (sqrt * sqrt  == i) return true;
        else return false;
    }

}
