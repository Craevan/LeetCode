package com.leetcode.task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSum1() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum2() {
        int[] input = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = twoSum.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSum3() {
        int[] input = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = twoSum.twoSum(input, target);
        assertArrayEquals(expected, actual);
    }
}
