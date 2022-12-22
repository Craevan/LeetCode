package com.leetcode.task1232;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int dx1 = coordinates[i][0] - coordinates[0][0];
            int dy1 = coordinates[i][1] - coordinates[0][1];
            int s = dx * dy1 - dx1 * dy;
            if (s != 0) {
                return false;
            }
        }
        return true;
    }
}
