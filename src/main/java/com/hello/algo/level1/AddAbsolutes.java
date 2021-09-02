package com.hello.algo.level1;

public class AddAbsolutes {

    public static void main(String[] args) {

        int[] lottos = {1,2, 3};
        boolean[] signs  = {false, false, true};

        System.out.println(solution(lottos, signs));

    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i=0 ; i<absolutes.length ; i++) {
            answer += signs[i] ? absolutes[i] : -1 * absolutes[i];
        }

        return answer;
    }

}
