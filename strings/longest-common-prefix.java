// Problem: Longest Common Prefix
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/longest-common-prefix/
// Approach: Horizontal Scanning
// Time Complexity: O(S)
// Space Complexity: O(1)

// Approach Explanation:
// Start with the first string as prefix.
// Compare it with each string and reduce the prefix
// until all strings start with it.

class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
