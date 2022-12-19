package com.leetcode.task1779;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void nearestValidPoint() {
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int x = 3;
        int y = 4;
        int actual = solution.nearestValidPoint(x, y, points);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void nearestValidPoint2() {
        int[][] points = {{3, 4}};
        int x = 3;
        int y = 4;
        int actual = solution.nearestValidPoint(x, y, points);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void nearestValidPoint3() {
        int[][] points = {{2, 3}};
        int x = 3;
        int y = 4;
        int actual = solution.nearestValidPoint(x, y, points);
        int expected = -1;
        assertEquals(expected, actual);
    }

    //[1,1],[6,2],[1,5],[3,1

    @Test
    void nearestValidPoint4() {
        int[][] points = {{1, 1}, {6, 2}, {1, 5}, {3, 1}};
        int x = 5;
        int y = 1;
        int actual = solution.nearestValidPoint(x, y, points);
        int expected = 3;
        assertEquals(expected, actual);
    }
}