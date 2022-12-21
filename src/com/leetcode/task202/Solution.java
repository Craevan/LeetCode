package com.leetcode.task202;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> integers = new HashSet<>();
        while (!integers.contains(n)) {
            integers.add(n);
            int sum = 0;
            while (n != 0) {
                int tmp = n % 10;
                sum += tmp * tmp;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
