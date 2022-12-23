package com.leetcode.task1572;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void diagonalSumTest1() {
        int[][] input = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int expected = 25;
        int actual = solution.diagonalSum(input);
        assertEquals(expected, actual);
    }

    @Test
    void diagonalSumTest2() {
        int[][] input = {{1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        int expected = 8;
        int actual = solution.diagonalSum(input);
        assertEquals(expected, actual);
    }

    @Test
    void diagonalSumTest3() {
        int[][] input = {{5}};
        int expected = 5;
        int actual = solution.diagonalSum(input);
        assertEquals(expected, actual);
    }
}