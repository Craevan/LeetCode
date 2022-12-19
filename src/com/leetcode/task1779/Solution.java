package com.leetcode.task1779;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        List<Integer> positions = new ArrayList<>();
        int minimumDistance = Integer.MAX_VALUE;
        int position = -1;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                positions.add(i);
            }
        }
        if (positions.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < positions.size(); i++) {
            int distance = distance(x, y, points[positions.get(i)]);
            if (distance < minimumDistance) {
                minimumDistance = distance;
                position = positions.get(i);
            }
        }
        return position;
    }

    private int distance(int x, int y, int[] array) {
        return Math.abs(x - array[0]) + Math.abs(y - array[1]);
    }
}
