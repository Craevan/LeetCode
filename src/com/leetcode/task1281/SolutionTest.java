package com.leetcode.task1281;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void subtractProductAndSum() {
        int actual = solution.subtractProductAndSum(234);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void subtractProductAndSum2() {
        int actual = solution.subtractProductAndSum(4421);
        int expected = 21;
        assertEquals(expected, actual);
    }
}