package com.leetcode.task1491;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void average1() {
        int[] salary = {4000,3000,1000,2000};
        double actual = solution.average(salary);
        double expected = 2500.00000;
        assertEquals(expected, actual);
    }
}