package com.hello.algo.level1;

import java.util.HashMap;

public class Poncketmon {

    public static void main(String[] args) {

        int[] lottos = {3,1,2,3};
        System.out.println(solution(lottos));

    }

    public static int solution(int[] nums) {
        int answer = 0;
        int maxCount = nums.length/2;

        HashMap<Integer, Integer> pokeMap = new HashMap<>();

        // 각 폰켓몬 별로 저장ㅇㅅㅇ
        for (int num : nums) {
            pokeMap.put(num, pokeMap.getOrDefault(num, 0)+1);
        }

        //최대 횟수를 돌면서, count저장
        for (int key : pokeMap.keySet()) {
            answer++;
            if (answer >= maxCount) {
                return answer;
            }
        }

        return answer;
    }

}
