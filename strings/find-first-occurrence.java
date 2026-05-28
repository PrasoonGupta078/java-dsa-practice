// Problem: Find the Index of the First Occurrence in a String
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Approach: Brute Force String Matching
// Time Complexity: O((n - m + 1) * m)
// Space Complexity: O(1)

// Approach Explanation:
// Traverse the main string and compare characters
// one by one with the target substring.
// Return the starting index when full match is found.

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
