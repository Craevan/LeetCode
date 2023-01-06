package com.leetcode.task213;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void robTest1() {
        int[] input = {2, 3, 2};
        int expected = 3;
        int actual = solution.rob(input);
        assertEquals(expected, actual);
    }

    @Test
    void robTest2() {
        int[] input = {1, 2, 3, 1};
        int expected = 4;
        int actual = solution.rob(input);
        assertEquals(expected, actual);
    }

    @Test
    void robTest3() {
        int[] input = {1, 2, 3};
        int expected = 3;
        int actual = solution.rob(input);
        assertEquals(expected, actual);
    }
}
