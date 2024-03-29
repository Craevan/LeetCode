## Number of 1 Bits

Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as
a signed integer type. It should not affect your implementation, as the integer's internal binary representation
is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. 
Therefore, in Example 3, the input represents the signed integer. -3.

___

#### Example 1:

Input: `n = 00000000000000000000000000001011`<br>
Output: `3`<br>
Explanation: `The input binary string 00000000000000000000000000001011 has a total of three '1' bits.`<br>

#### Example 2:

Input: `n = 00000000000000000000000010000000`<br>
Output: `1`<br>
Explanation: `The input binary string 00000000000000000000000010000000 has a total of one '1' bit.`<br>

#### Example 3:

Input: `n = 11111111111111111111111111111101`<br>
Output: `31`<br>
Explanation: `The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.`<br>

#### Constraints:

* The input must be a binary string of length 32.

#### Follow up: 
If this function is called many times, how would you optimize it?