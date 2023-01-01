package com.leetcode.task1137;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void tribonacciTest1() {
        int input = 4;
        int expected = 4;
        int actual = solution.tribonacci(input);
        assertEquals(expected, actual);
    }

    @Test
    void tribonacciTest2() {
        int input = 25;
        int expected = 1389537;
        int actual = solution.tribonacci(input);
        assertEquals(expected, actual);
    }
}