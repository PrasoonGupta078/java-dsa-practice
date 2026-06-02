// Problem: Plus One
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/plus-one/
// Approach: Digit Manipulation
// Time Complexity: O(n)
// Space Complexity: O(1) or O(n) (when a new array is needed)

// Approach Explanation:
// Traverse the array from right to left.
// If a digit is less than 9, increment it and return.
// If a digit is 9, change it to 0 and continue.
// If all digits are 9, create a new array of size n+1,
// place 1 at the first position, and return it.

class Solution {
    public int[] plusOne(int[] digits) {
       int length = digits.length - 1;
       for(int i = length; i >= 0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        } else {
            digits[i] = 0;
        }
       }
       int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
