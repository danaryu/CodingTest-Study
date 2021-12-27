package com.hello.algo.programmers.level1;

import java.util.ArrayList;
import java.util.Stack;

public class DartGame {

    public static void main(String[] args) {

        String dartResult = "1D2S#10S";
        System.out.println(solution(dartResult));

    }

    // 점수 | 보너스 | [옵션 : 스타상 * 아차상 #] 으로 이루어진 문자열 3세트.
    // 보너스는 S, D, T (점수, 점수제곱, 점수세제곱)
    // 스타상 : 현재 점수, 이전 점수 *2 (두배)
    // 아차상 : -현재점수
    // 스타상 + 아차상 중첨 시 * -2배
    public static int solution(String dartResult) {
        int answer = 0;
        String last = "";

        int score = 0,preScore = 0;
        char[] charArray = dartResult.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i<charArray.length ; i++) {
            char current = charArray[i];

            /* c가 보너스일 때 */
            if (Character.isLetter(current)) {
                if (current == 'S') score = (int) Math.pow(Integer.parseInt(last), 1);
                if (current == 'D') score = (int) Math.pow(Integer.parseInt(last), 2);
                if (current == 'T') score = (int) Math.pow(Integer.parseInt(last), 3);

                // 점수 초기화
                last = "";
                stack.push(score);

            /* c가 옵션일 때 (옵션 로직) */
            } else if (current == '*' || current == '#'){
                if (current == '*') { /* 스타상 */
                    if (stack.size() >= 2) {
                        // 마지막 점수
                        score = stack.pop() * 2;
                        // 그 전 점수
                        preScore = stack.pop() * 2;

                        stack.push(preScore);
                        stack.push(score);
                    } else { //하나 뿐일 때
                        score = stack.pop() * 2;
                        stack.push(score);
                    }
                } else { /* 아차상 */
                    score = stack.pop() * -1;
                    stack.push(score);
                }

            /* c가 점수일 때, 두자리 정수일 때 대응 */
            } else {
                score = 0;
                last += String.valueOf(current);
            }
        }

        for (int a : stack) {
            answer += a;
        }

        return answer;
    }

}

