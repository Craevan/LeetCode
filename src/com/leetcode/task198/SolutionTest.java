package com.leetcode.task198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void robTest1() {
        int[] input = {1, 2, 3, 1};
        int exppected = 4;
        int actual = solution.rob(input);
        assertEquals(exppected, actual);
    }

    @Test
    void robTest2() {
        int[] input = {2, 7, 9, 3, 1};
        int exppected = 12;
        int actual = solution.rob(input);
        assertEquals(exppected, actual);
    }
}
