package com.hello.algo.level1;

public class Uniform {

    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        System.out.println(solution(n, lost, reserve));

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] student = new int[n];

        // 체육복 도난 (-1)
        for (int j=0; j<lost.length ; j++) {
            student[lost[j]-1] -= 1;
        }

        // 여벌의 체육복 (+1)
        for (int j=0 ; j<reserve.length ; j++) {
            student[reserve[j]-1] += 1;
        }

        // 체육복이 없는 경우, 앞번호나 뒷번호에게 체육복을 빌린다.
        for (int k=0 ; k<student.length ; k++) {
            // 첫번째나 마지막이 아닌 학생 중
            if (student[k] < 0) {
                // 첫번째가 아니면서, 이전 학생의 체육복을 빌릴 수 있는 경우
                if (k != 0 && student[k-1] > 0) {
                    student[k]++;
                    student[k-1]--;
                // 마지막이 아니면서, 다음 학생의 체육복을 빌릴 수 있는 경우
                } else if (k != student.length-1 && student[k+1] > 0) {
                    student[k]++;
                    student[k+1]--;
                }
            }

            /*if (k != 0 && k != student.length-1) {
                if (student[k] == -1) {
                   if (student[k-1] == 1) {
                       student[k] += 1;
                       student[k-1] -= 1;
                   } else if (student[k+1] == 1) {
                       student[k] += 1;
                       student[k+1] -= 1;
                   }
                }
            // 첫번째 학생인 경우
            } else if (k == 0) {
                if (student[k+1] == 1) {
                    student[k] += 1;
                    student[k+1] -= 1;
                }
            // 끝번호 학생인 경우
            } else {
                if (student[k-1] == 1) {
                    student[k] += 1;
                    student[k-1] -= 1;
                }
            }*/

        }

        for (int a=0 ; a<student.length; a++) {
            System.out.println("i = " +  a + " " + student[a]);
            if (!(student[a] < 0)) answer++;
        }

        return answer;
    }

}
