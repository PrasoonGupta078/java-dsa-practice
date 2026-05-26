// Problem: Merge Two Sorted Lists
// Platform: LeetCode
// Difficulty: Easy
// Link: https://leetcode.com/problems/merge-two-sorted-lists/
// Approach: Linked List Traversal with Dummy Node
// Time Complexity: O(n + m)
// Space Complexity: O(1)

// Approach Explanation:
// Use a dummy node to simplify merged list creation.
// Compare nodes from both lists and attach the smaller one.

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);

        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
