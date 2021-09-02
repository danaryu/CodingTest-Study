package com.hello.algo.level1;

import java.util.Arrays;
import java.util.HashMap;

public class PlayerNotFinished {

    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println("solution = " + solution(participant, completion));

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        Arrays.stream(participant).forEach((player) -> {
            map.put(player, map.getOrDefault(player, 0)+1);
        });

        Arrays.stream(completion).forEach((player -> {
            map.put(player, map.getOrDefault(player, 0)-1);
        }));

        for (String key : map.keySet()) {
            Integer number = map.get(key);
            if(number == 1) answer = key;
        }

        return answer;
    }


}
