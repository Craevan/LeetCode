package com.leetcode.task746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minCostClimbingStairsTest1() {
        int[] input = {10, 15, 20};
        int expected = 15;
        int actual = solution.minCostClimbingStairs(input);
        assertEquals(expected, actual);
    }

    @Test
    void minCostClimbingStairsTest2() {
        int[] input = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        int actual = solution.minCostClimbingStairs(input);
        assertEquals(expected, actual);
    }
}
