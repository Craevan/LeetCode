package com.leetcode.task1672;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void maximumWealthTest1() {
        int[][] inputArray = {{1, 2, 3}, {3, 2, 1}};
        int expected = 6;
        int actual = solution.maximumWealth(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    void maximumWealthTest2() {
        int[][] inputArray = {{1, 5}, {7, 3}, {3, 5}};
        int expected = 10;
        int actual = solution.maximumWealth(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    void maximumWealthTest3() {
        int[][] inputArray = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int expected = 17;
        int actual = solution.maximumWealth(inputArray);
        assertEquals(expected, actual);
    }
}