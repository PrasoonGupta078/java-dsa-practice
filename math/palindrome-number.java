// Problem: Palindrome Number
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/palindrome-number/
// Approach: Reverse Half of Number
// Time Complexity: O(log n)
// Space Complexity: O(1)

// Approach Explanation:
// Reverse only half of the number and compare it with the remaining half.
// This avoids integer overflow and improves efficiency.

class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return (x == rev || x == rev / 10);
    }
}
