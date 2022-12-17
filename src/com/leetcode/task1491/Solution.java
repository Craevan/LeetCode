package com.leetcode.task1491;

import java.util.Arrays;

public class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        return (double) sum / (double) (salary.length - 2);
    }

    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        Solution sol = new Solution();
        System.out.println(sol.average(salary));
    }
}
