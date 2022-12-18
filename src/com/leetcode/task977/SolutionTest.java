package com.leetcode.task977;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void sortedSquares() {
        int[] array = {-4, -1, 0, 3, 10};
        int[] actual = solution.sortedSquares(array);
        int[] expected = {0, 1, 9, 16, 100};
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortedSquares2() {
        int[] array = {-7, -3, 2, 3, 11};
        int[] actual = solution.sortedSquares(array);
        int[] expected = {4, 9, 9, 49, 121};
        assertArrayEquals(expected, actual);
    }
}