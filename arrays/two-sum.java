// Problem: Two Sum
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/two-sum/
// Approach: Brute Force
// Time Complexity: O(n²)
// Space Complexity: O(1)

// Approach Explanation:
// Use nested loops to check all pairs of numbers.
// For each element, compare it with all subsequent elements to find the target sum.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
