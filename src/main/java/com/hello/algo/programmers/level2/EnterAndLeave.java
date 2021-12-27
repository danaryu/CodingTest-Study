package com.hello.algo.programmers.level2;

public class EnterAndLeave {

    public static void main(String[] args) {
        int[] enter = {1,3,2};
        int[] leave = {1,2,3};

        System.out.println(solution(enter, leave));
    }

    // 반드시 만나는 경우
    // 1. 입실은 나중에, 퇴실은 먼저
    // 2. 입실은 먼저, 퇴실은 나중에
    // 3.
    public static int[] solution(int[] enter, int[] leave) {
        int[] answer = {};

        for (int i=0 ; i<enter.length ; i++) {
            // 순서대로 입실 나중에, 퇴실 먼저


        }

        return answer;
    }

}
