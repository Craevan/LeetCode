package com.leetcode.task1290;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getDecimalValueTest1() {
        final ListNode ld = new ListNode(1,
                new ListNode(0,
                        new ListNode(1)));
        Integer expected = 5;
        Integer actual = solution.getDecimalValue(ld);
        assertEquals(expected, actual);
    }

    @Test
    void getDecimalValueTest2() {
        final ListNode ld = new ListNode(0);
        Integer expected = 0;
        Integer actual = solution.getDecimalValue(ld);
        assertEquals(expected, actual);
    }
}