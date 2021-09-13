package com.hello.algo.level1;

public class SecretMap {

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        System.out.println(solution(n, arr1, arr2));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {

            int a = arr1[i];
            int b = arr2[i];

            String binaryString = String.format("%" + n + "s", Integer.toBinaryString(a | b))
                    .replaceAll("0", " ")
                    .replaceAll("1", "#");

            answer[i] = binaryString;
            // System.out.println("binaryString = " + binaryString);
        }

        return answer;
    }
}
