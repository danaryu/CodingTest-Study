package com.hello.codingtest;

import com.hello.algo.level1.FailureRate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FailureRateTest {

    @Test
    void test() {

        FailureRate test = new FailureRate();

        assertArrayEquals(new int[] {3,4,2,1,5}, test.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}));
        assertArrayEquals(new int[] {4,1,2,3}, test.solution(4, new int[] {4,4,4,4,4}));
        assertArrayEquals(new int[] {2,1,3,4}, test.solution(4, new int[] {1,1,1,1,2}));
        assertArrayEquals(new int[] {4,2,3,1}, test.solution(4, new int[] {3,2,5,4,2}));
        assertArrayEquals(new int[] {7,6,2,3,5,4,1}, test.solution(7, new int[] {2, 1, 2, 6, 2, 4, 3, 3,7,5}));
        assertArrayEquals(new int[] {1,2,3,4,5}, test.solution(5, new int[] {}));

    }


}
