## 1588. Sum of All Odd Length Subarrays

Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

#### Example 1:

Input: `arr = [1,4,2,5,3]`<br>
Output: `58`<br>
Explanation: The odd-length subarrays of arr and their sums are:

- `[1] = 1`
- `[4] = 4`
- `[2] = 2`
- `[5] = 5`
- `[3] = 3`
- `[1,4,2] = 7`
- `[4,2,5] = 11`
- `[2,5,3] = 10`
- `[1,4,2,5,3] = 15`<br>
  If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

#### Example 2:

Input: `arr = [1,2]`<br>
Output: `3`<br>
Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum is 3.

#### Example 3:

Input: `arr = [10,11,12]`<br>
Output: `66`

#### Constraints:

- `1 <= arr.length <= 100`
- `1 <= arr[i] <= 1000`

#### Follow up:

Could you solve this problem in O(n) time complexity?