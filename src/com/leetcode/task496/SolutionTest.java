package com.leetcode.task496;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void nextGreaterElement() {
        int[] input1 = {4, 1, 2};
        int[] input2 = {1, 3, 4, 2};
        int[] expected = {-1, 3, -1};
        int[] actual = solution.nextGreaterElement(input1, input2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void nextGreaterElement2() {
        int[] input1 = {2, 4};
        int[] input2 = {1, 2, 3, 4};
        int[] expected = {3, -1};
        int[] actual = solution.nextGreaterElement(input1, input2);
        assertArrayEquals(expected, actual);
    }

    @Test
    void nextGreaterElement3() {
        int[] input1 = {1, 3, 5, 2, 4};
        int[] input2 = {6, 5, 4, 3, 2, 1, 7};
        int[] expected = {7, 7, 7, 7, 7};
        int[] actual = solution.nextGreaterElement(input1, input2);
        assertArrayEquals(expected, actual);
    }
}