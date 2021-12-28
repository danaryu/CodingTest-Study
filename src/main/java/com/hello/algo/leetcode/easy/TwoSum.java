package com.hello.algo.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++) {
            int value = target - nums[i];
            // 같은 인덱스가 아니여야한다.
            if(map.containsKey(value) && map.get(value) != i) {
                return new int[]{i, map.get(value)};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, 4};
        int target = 9;
        System.out.println(twoSum(numbers, target)[0] + ", " + twoSum(numbers, target)[1]);
    }
}
