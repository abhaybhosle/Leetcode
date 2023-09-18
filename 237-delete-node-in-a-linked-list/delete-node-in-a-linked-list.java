/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // Invalid input or cannot delete the last node using this method
            return;
        }

        // Copy the value of the next node to the current node
        node.val = node.next.val;

        // Update the current node's 'next' pointer to skip the next node
        node.next = node.next.next;
    }
}
