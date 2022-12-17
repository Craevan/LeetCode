package com.leetcode.task35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final Solution solution = new Solution();


    @Test
    void searchInsertTest1() {
        int[] nums = {1,3};
        int target = 2;
        int expected = 1;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void searchInsertTest2() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int expected = 2;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void searchInsertTest3() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int expected = 1;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void searchInsertTest4() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int expected = 4;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void searchInsertTest5() {
        int[] nums = {1,3,5,6};
        int target = 0;
        int expected = 0;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void searchInsertTest6() {
        int[] nums = {1,3,5};
        int target = 4;
        int expected = 2;
        int actual = solution.searchInsert(nums, target);
        assertEquals(expected, actual);
    }
}