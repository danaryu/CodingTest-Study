package com.hello.algo.programmers.level1;

public class GetBestGradeOfLottos {

        public static void main(String[] args) {

            int[] lottos = {1, 2, 5, 6, 7, 8};
            int[] win_nums = {20, 9, 3, 45, 4, 35};

            int[] answer = new int[2];

            answer = solution(lottos, win_nums);
            for (int a : answer) {
                System.out.println("answer = " + a);
            }

        }

        public static int[] solution(int[] lottos, int[] win_nums) {
            int zeroCnt = 0, correctCnt = 0;
            int highest, lowest = 0;

            for (int lotto : lottos) {
                if (lotto == 0) zeroCnt++;
                for (int num : win_nums) {
                    if (lotto == num) correctCnt++;
                }
            }

            // 최고순위 : 0인게 다 맞았을 경우
            highest = 7 - correctCnt - zeroCnt;

            // 최저순위 : 0인거 다틀린 경우
            lowest = 7 - correctCnt;

            if (lowest > 5) lowest = 6;
            if (highest > 5) highest = 6;

            return new int[] {highest, lowest};

        }

}
