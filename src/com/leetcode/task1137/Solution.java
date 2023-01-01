package com.leetcode.task1137;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final List<Integer> CACHE = new ArrayList<>();

    {
        CACHE.add(0);
        CACHE.add(1);
        CACHE.add(1);
    }

    public int tribonacci(int n) {
        if (n < 3) {
            return CACHE.get(n);
        }
        for (int i = 3; i <= n; i++) {
            CACHE.add(CACHE.get(i - 1) + CACHE.get(i - 2) + CACHE.get(i - 3));
        }
        return CACHE.get(n);
    }
}
