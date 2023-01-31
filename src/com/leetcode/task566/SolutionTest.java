package com.leetcode.task566;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void matrixReshape1() {
        int[][] inputMatrix = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] expected = {{1, 2, 3, 4}};
        int[][] actual = solution.matrixReshape(inputMatrix, r, c);
        assertArrayEquals(expected, actual);
    }

    @Test
    void matrixReshape2() {
        int[][] inputMatrix = {{1, 2}, {3, 4}};
        int r = 2;
        int c = 4;
        int[][] expected = {{1, 2}, {3, 4}};
        int[][] actual = solution.matrixReshape(inputMatrix, r, c);
        assertArrayEquals(expected, actual);
    }
}
