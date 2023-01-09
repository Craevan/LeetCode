package com.leetcode.task104;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxDepthTest1() {
        TreeNode input = new TreeNode(3,
                new TreeNode(9), new TreeNode(20,
                new TreeNode(15), new TreeNode(7)));
        int expected = 3;
        int actual = solution.maxDepth(input);
        assertEquals(expected, actual);
    }

    @Test
    void maxDepthTest2() {
        TreeNode input = new TreeNode(3, null, new TreeNode(2));
        int expected = 2;
        int actual = solution.maxDepth(input);
        assertEquals(expected, actual);
    }
}
