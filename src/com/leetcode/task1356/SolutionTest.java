package com.leetcode.task1356;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortByBitsTest1() {
        int[] input = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected = {0, 1, 2, 4, 8, 3, 5, 6, 7};
        int[] actual = solution.sortByBits(input);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortByBitsTest2() {
        int[] input = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] expected = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] actual = solution.sortByBits(input);
        assertArrayEquals(expected, actual);
    }
}
