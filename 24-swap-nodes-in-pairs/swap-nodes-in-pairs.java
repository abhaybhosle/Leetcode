/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        // Base case: If the list is empty or has only one node, no need to swap.
        if (head == null || head.next == null) {
            return head;
        }
        
        // Store the next pair of nodes to be swapped.
        ListNode nextPair = head.next.next;
        
        // Swap the current pair of nodes.
        ListNode newHead = head.next;    // Store the second node of the current pair in newHead.
        head.next.next = head;           // Reverse the direction of the arrow between the two nodes.
        head.next = swapPairs(nextPair); // Recursively swap pairs in the remaining part of the linked list.
        
        return newHead;                  // Return the new head of the modified sublist.
    }
}
