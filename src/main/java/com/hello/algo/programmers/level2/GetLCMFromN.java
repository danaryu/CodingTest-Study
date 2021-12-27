package com.hello.algo.programmers.level2;

import java.util.Arrays;

public class GetLCMFromN {

    /**
     * 먼저, 최대공약수(gcd)를 구한 후, 그를 이용하여 최소공배수(lcm)을 구해보자!
     *
     * 최대 공약수 구하기
     * 유클리드 호제법
     * 호제법이란 말은 두 수가 서로 상대방 수를 나누어서 결국 원하는 수를 얻는 알고리즘을 나타낸다.
     *
     * 2개의 자연수(또는 정식) a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b),
     * a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 이 성질에 따라, b를 r로 나눈 나머지 r’를 구하고,
     * 다시 r을 r’로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때 나누는 수가 a와 b의 최대공약수이다.
     * 이는 명시적으로 기술된 가장 오래된 알고리즘으로서도 알려져 있으며, 기원전 300년경에 쓰인 유클리드의 《원론》 제7권, 명제 1부터 3까지에 해당한다.
     */

    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        System.out.println(solution(arr));
    }

    /**
     * 유클리드 호제법 구현하기
     * 1. 큰 수를 작은수로 나눈다.
     * 2. 나눴던 수와 1.의 나머지를 나눈다.
     * 3. 그 나머지를 다시 나눴던 수로 나눈다.
     * 4. 나머지가 0일 때, 나누는 수로 사용되 r이 최대공약수가 된다.
     */

    public static int getGCD(int a, int b) {
        if (a % b == 0) return b;
        return getGCD(b, a % b);
    }

    public static int getLCM(int a, int b) {
        return a * b / getGCD(a, b);
    }

    public static int solution(int[] arr) {
        int a = arr[0];
        int gcd = 0, lcm = 0;

        for (int i = 1 ; i < arr.length ; i++) {
            int b = arr[i];
            lcm = getLCM(a, b);
            a = lcm;
        }

        return lcm;
    }


}
