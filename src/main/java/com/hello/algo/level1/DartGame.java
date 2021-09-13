package com.hello.algo.level1;

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

        int score = 0, score2 = 0;
        char[] charArray = dartResult.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i<charArray.length ; i++) {
            char c = charArray[i];

            if (Character.isLetter(c)) {
                /* c가 보너스일 때 */
                if (c == 'S') score = (int) Math.pow(Integer.parseInt(last), 1);
                if (c == 'D') score = (int) Math.pow(Integer.parseInt(last), 2);
                if (c == 'T') score = (int) Math.pow(Integer.parseInt(last), 3);

                last = "";
                stack.push(score);
            } else if (c == '*' || c == '#'){
                /* c가 옵션일 때 (옵션 로직) */

                if (c == '*') { /* 스타상 */
                    if (stack.size() >= 2) {
                        // 마지막 점수
                        score = stack.pop() * 2;
                        // 그 전 점수
                        score2 = stack.pop() * 2;
                        stack.push(score2);
                        stack.push(score);
                    } else { //하나 뿐일 때..
                        score = stack.pop() * 2;
                        stack.push(score);
                    }
                } else { /* 아차상 */
                    score = stack.pop() * -1;
                    stack.push(score);
                }
            } else {
                /* c가 점수일 때 */
                score = 0;
                last += String.valueOf(c);
            }
        }

        for (int a : stack) {
            answer += a;
        }

        return answer;
    }

}

