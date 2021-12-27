package com.hello.algo.programmers.level2;

public class MultiMatrix {

    public static void main(String[] args) {
        int[][] arr1 = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};
        System.out.println(solution(arr1, arr2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int [arr1.length][arr2[0].length];

        for (int i=0 ; i<arr1.length ; i++) {
            for (int j=0 ; j<arr2[0].length ; j++) {

                int sum = 0;
                for (int k=0 ; k<arr2.length ; k++) {
                    //  arr1 * arr2
                    // (0,0 * 0,0) + (0,1 * 1,0)
                    // (0,0 * 0,1) + (0,1 * 1,1)
                    // (1,0 * 0,0) + (1,1 * 1,0)
                    // (1,0 * 0,1) + (1,1 * 1,1)
                    // (2,0 * 0,0) + (2,1 * 1,0)
                    // (2,0 * 0,1) + (2,1 * 1,1)
                    sum += arr1[i][k] * arr2[k][j];
                    /*
                         System.out.println("arr1[" + i + "][" + k +"] * arr2[" + k + "][" + j + "] = "
                                + answer[i][j] * answer[j][k]);
                    */
                }
                answer[i][j] = sum;
                //System.out.println("answer[i][j] = " + answer[i][j]);
            }

        }

        return answer;
    }
}
