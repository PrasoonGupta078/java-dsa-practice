// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

// Approach Explanation:
// Use two pointers.
// One pointer tracks unique elements, the other scans the array.
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) 
          return 0;

        int i = 0; 

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; 
    }
}
