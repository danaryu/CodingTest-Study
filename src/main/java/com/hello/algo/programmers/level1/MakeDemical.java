package com.hello.algo.programmers.level1;

public class MakeDemical {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(solution(nums));

    }

    // 서로 다른 숫자 3개를 골라 더했을 때, 소수가 되는 경우의 수 return
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int solution(int[] nums) {
        int answer = 0;

        // 세 수의 합 구하기
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }

        return answer;
    }

}
