// Problem: Valid Parentheses
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/valid-parentheses/
// Approach: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

// Approach Explanation:
// Use a stack to store opening brackets.
// For every closing bracket, check if it matches the top of stack.
import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (c == ')' && top != '(')
                    return false;
                if (c == '}' && top != '{')
                    return false;
                if (c == ']' && top != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
