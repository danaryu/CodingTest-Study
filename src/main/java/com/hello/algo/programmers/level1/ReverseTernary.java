package com.hello.algo.programmers.level1;

public class ReverseTernary {

    public static void main(String[] args) {

        int number = 45;
        System.out.println(solution(number));
    }

    public static int solution(int n) {
        int answer = 0;
        answer = Integer.parseInt(
                new StringBuffer(Integer.toString(n, 3))
                .reverse()
                .toString(), 3);
        return answer;
    }

}
