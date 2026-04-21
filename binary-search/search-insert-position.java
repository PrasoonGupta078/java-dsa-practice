// Problem: Search Insert Position
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/search-insert-position/
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)

// Approach Explanation:
// Use binary search to find the target.
// If not found, return the position where it should be inserted.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
