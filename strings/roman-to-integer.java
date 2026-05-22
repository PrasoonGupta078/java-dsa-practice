// Problem: Roman to Integer
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/roman-to-integer/
// Approach: Traversal with Subtraction Logic
// Time Complexity: O(n)
// Space Complexity: O(1)

// Approach Explanation:
// Traverse the string from left to right.
// If current Roman numeral is smaller than the next numeral,
// subtract it; otherwise add it.

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int currentValue = getValue(s.charAt(i));
            
            if (i < n - 1 && currentValue < getValue(s.charAt(i + 1))) {
                total -= currentValue;
            } 
            
            else {
                total += currentValue;
            }
        }
        
        return total;
    }
    
    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
