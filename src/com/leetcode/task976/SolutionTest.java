package com.leetcode.task976;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void largestPerimeter() {
        int[] input = {2, 1, 2};
        int expected = 5;
        int actual = solution.largestPerimeter(input);
        assertEquals(expected, actual);
    }

    @Test
    void largestPerimeter1() {
        int[] input = {1, 2, 1, 10};
        int expected = 0;
        int actual = solution.largestPerimeter(input);
        assertEquals(expected, actual);
    }

    @Test
    void largestPerimeter2() {
        int[] input = {3, 2, 3, 4};
        int expected = 10;
        int actual = solution.largestPerimeter(input);
        assertEquals(expected, actual);
    }
}