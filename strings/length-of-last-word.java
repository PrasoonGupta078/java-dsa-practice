// Problem: Length of Last Word
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/length-of-last-word/
// Approach: Reverse Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

// Approach Explanation:
// Start from the end of the string.
// Skip trailing spaces.
// Count characters until a space or
// the beginning of the string is reached.
// Return the length of the last word.

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int length = s.length() - 1;
        while(length >= 0 && s.charAt(length) == ' ') {
          length--;
        }
        while(length >= 0 && s.charAt(length) != ' ') {
            count++;
            length--;
            }
        return count;
    }
}
