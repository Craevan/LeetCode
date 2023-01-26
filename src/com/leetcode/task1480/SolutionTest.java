package com.leetcode.task1480;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void runningSum() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 6, 10};
        int[] actual = solution.runningSum(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void runningSum2() {
        int[] input = {1, 1, 1, 1, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = solution.runningSum(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void runningSum3() {
        int[] input = {3, 1, 2, 10, 1};
        int[] expected = {3, 4, 6, 16, 17};
        int[] actual = solution.runningSum(input);
        assertArrayEquals(expected, actual);
    }
}