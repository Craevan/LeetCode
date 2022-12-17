package com.leetcode.task278;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int firstVersion = 1;
        int lastVersion = n;
        int minimumBadVersion = 0;
        while (firstVersion <= lastVersion) {
            int middle = (firstVersion + lastVersion) / 2;
            if (isBadVersion(middle)) {
                minimumBadVersion = middle;
                lastVersion = middle - 1;
            } else {
                firstVersion = middle + 1;
            }
        }
        return minimumBadVersion;
    }
}
