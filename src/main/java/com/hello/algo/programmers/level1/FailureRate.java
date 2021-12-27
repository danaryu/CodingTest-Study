package com.hello.algo.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FailureRate {

    public static void main(String[] args) {

        int n = 20;
        int[] stages = {1,2,2,1,3};
        System.out.println(solution(n, stages));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        HashMap<Integer, Integer> stageMap = new HashMap<>();
        HashMap<Integer, Double> failRateMap = new HashMap<>();

        // stage : 현재 도전중인 stage
        for (int stage : stages) {
            stageMap.put(stage, stageMap.getOrDefault(stage, 0) + 1);
        }

        // 도전자는 무조건 stage 1을 거치므로
        int player = stages.length;

        for (int i=1 ; i<=N ; i++) {
            if (stageMap.containsKey(i)) {
                int count = stageMap.get(i);
                failRateMap.put(i, (double) count / player);
                player = player - count;
            } else {
                failRateMap.put(i, 0.0);
            }
        }

        ArrayList<Integer> listKeySet = new ArrayList<>(failRateMap.keySet());
        ArrayList<Integer> array = new ArrayList<>();
        Collections.sort(listKeySet, (value1, value2) -> (failRateMap.get(value2).compareTo(failRateMap.get(value1))));

        for (int key : listKeySet) array.add(key);

        int size = 0;
        for (int a : array) answer[size++] = a;

        return answer;

    }
}


