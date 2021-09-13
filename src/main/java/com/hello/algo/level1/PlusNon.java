package com.hello.algo.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class PlusNon {

    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        return IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
    }

}
