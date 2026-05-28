// Problem: Remove Element
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/remove-element/
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

// Approach Explanation:
// Traverse the array and copy non-target elements forward.
// The variable k tracks the position for valid elements.

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
