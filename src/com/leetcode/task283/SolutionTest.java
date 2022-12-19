package com.leetcode.task283;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void moveZeroes() {
        int[] actual = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        solution.moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void moveZeroes2() {
        int[] actual = {0};
        int[] expected = {0};
        solution.moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void moveZeroes3() {
        int[] actual = {0, 0, 1};
        int[] expected = {1, 0, 0};
        solution.moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }
}