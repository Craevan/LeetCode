package com.leetcode.task167;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void twoSum() {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        int[] actual = solution.twoSum(array, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum2() {
        int[] array = {2, 3, 4};
        int target = 6;
        int[] expected = {1, 3};
        int[] actual = solution.twoSum(array, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum3() {
        int[] array = {-1, 0};
        int target = -1;
        int[] expected = {1, 2};
        int[] actual = solution.twoSum(array, target);
        assertArrayEquals(expected, actual);
    }


}