package com.leetcode.task167;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int first = numbers[i];
            int goal = target - first;
            int position = i + 1;
            if (position < numbers.length && checkGoal(numbers, i + 1, goal) != -1) {
                result[0] = i + 1;
                result[1] = checkGoal(numbers, i + 1, goal) + 1;
                return result;
            }
        }
        return null;
    }

    private int checkGoal(int[] array, int startPosition, int goal) {
        int start = startPosition;
        int lastPosition = array.length - 1;
        while (start <= lastPosition) {
            int middle = start + ((lastPosition - start) / 2);
            if (array[middle] == goal) {
                return middle;
            } else if (array[middle] > goal) {
                lastPosition = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
