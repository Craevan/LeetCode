package com.leetcode.task70;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<Integer> CACHE = new ArrayList<>();

    {
        CACHE.add(0);
        CACHE.add(1);
        CACHE.add(2);
    }

    public int climbStairs(int n) {
        if (n < CACHE.size()) {
            return CACHE.get(n);
        }
        for (int i = CACHE.size(); i <= n; i++) {
            CACHE.add(CACHE.get(i - 1) + CACHE.get(i - 2));
        }
        return CACHE.get(n);
    }
}
