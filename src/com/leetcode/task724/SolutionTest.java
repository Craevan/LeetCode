package com.leetcode.task724;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void pivotIndex1() {
        int[] input = {1, 7, 3, 6, 5, 6};
        int expected = 3;
        int actual = solution.pivotIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    void pivotIndex2() {
        int[] input = {1, 2, 3};
        int expected = -1;
        int actual = solution.pivotIndex(input);
        assertEquals(expected, actual);
    }

    @Test
    void pivotIndex3() {
        int[] input = {2, 1, -1};
        int expected = 0;
        int actual = solution.pivotIndex(input);
        assertEquals(expected, actual);
    }
}
