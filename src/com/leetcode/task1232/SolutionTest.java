package com.leetcode.task1232;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void checkStraightLineTest1() {
        int[][] input = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        boolean expected = true;
        boolean actual = solution.checkStraightLine(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkStraightLineTest2() {
        int[][] input = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        boolean expected = false;
        boolean actual = solution.checkStraightLine(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkStraightLineTest3() {
        int[][] input = {{0, 0}, {0, 1}, {0, -1}};
        boolean expected = true;
        boolean actual = solution.checkStraightLine(input);
        assertEquals(expected, actual);
    }

    @Test
    void checkStraightLineTest4() {
        int[][] input = {{0, 0}, {1, 0}, {4, 0}};
        boolean expected = true;
        boolean actual = solution.checkStraightLine(input);
        assertEquals(expected, actual);
    }
}