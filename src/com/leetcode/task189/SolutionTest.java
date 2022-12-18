package com.leetcode.task189;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void rotate() {
        int[] actual = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(actual, 3);
        int[] expected = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, actual);
    }

    @Test
    void rotate2() {
        int[] actual = {-1, -100, 3, 99};
        solution.rotate(actual, 2);
        int[] expected = {3, 99, -1, -100};
        assertArrayEquals(expected, actual);
    }
}