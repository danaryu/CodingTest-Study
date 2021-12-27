package com.hello.algo.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PlusNumbers {

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(solution(numbers));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length ; i++ ){
            for (int j = i + 1 ; j < numbers.length ; j++ ) {

                int n = numbers[i] + numbers[j];
                set.add(n);
            }

        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

}