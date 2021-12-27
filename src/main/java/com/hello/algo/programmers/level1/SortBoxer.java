package com.hello.algo.programmers.level1;

import javax.swing.*;
import java.util.*;

public class SortBoxer {

    public static void main(String[] args) {
        int[] weights = {60,70,60};
        String[] head2head = {"NNN","NNN","NNN"};

        System.out.println(solution(weights, head2head));

    }

    public static int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        // 승률
        double winningPercent = 0;
        List<Boxer> boxers = new ArrayList<>();

        // i 선수 번호, j 상대 선수 번호
        for (int i = 0; i < weights.length; i++) {
            int weightOfI = weights[i];
            String result = head2head[i];

            int winCountOfI = 0;
            int winToHeavy = 0;
            int stageCount = 0;
            int lose = 0;

            char[] results = result.toCharArray();
            for (int j = 0; j < head2head.length; j++) {

                int weightOfJ = weights[j];
                char resultToJ = results[j];

                // 이긴 경우
                if (resultToJ == 'W') {
                    winCountOfI++;
                    if (weightOfJ > weightOfI) {
                        winToHeavy++;
                    }
                } else if (resultToJ == 'L') {
                    stageCount++;
                }

                winningPercent = (double) winCountOfI / (stageCount + winCountOfI) * 100.00;
            }

                boxers.add(new Boxer(i, weightOfI, winToHeavy, winningPercent));

            }

            /* 정렬하는 로직 */
            compare(boxers);
/*
            for (int i = 0; i < boxers.size(); i++) {
                int number = boxers.get(i).getNumber();
                answer[i] = number + 1;
            }
*/
            return boxers.stream().mapToInt(i -> i.getNumber() + 1).toArray();
        }


    private static void compare(List<Boxer> boxers) {
        Collections.sort(boxers, new Comparator<Boxer>() {

            @Override
            public int compare(Boxer o1, Boxer o2) {

            if (o1.winPercent > o2.winPercent) return -1;
                else if (o2.winPercent > o1.winPercent) return 1;
                else {
                    if (o1.winToHeavy > o2.winToHeavy) return -1;
                    else if (o2.winToHeavy > o1.winToHeavy) return 1;
                    else {
                        if (o1.weight > o2.weight) return -1;
                        else if (o2.weight > o1.weight) return 1;
                        else {
                            if (o1.number > o2.number) return 1;
                            else return -1;
                        }
                    }

                }

            }

        });
    }

    static class Boxer {
        int number;
        int weight;
        int winToHeavy;
        double winPercent;

        public Boxer(int number, int weight, int winToHeavy, double winPercent) {
            this.number = number;
            this.weight = weight;
            this.winToHeavy = winToHeavy;
            this.winPercent = winPercent;
        }

        public int getNumber() {
            return number;
        }

        public int getWeight() {
            return weight;
        }

        public int getWinToHeavy() {
            return winToHeavy;
        }

        public double getWinPercent() {
            return winPercent;
        }

        @Override
        public String toString() {
            return "[" + number + ", " + winPercent + ", " + winToHeavy + ", " + weight + "]";

        }
    }


}
