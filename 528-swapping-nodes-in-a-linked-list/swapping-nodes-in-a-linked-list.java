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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i = 1; i < k;i++){ //Here we will get the first node value to be swaped
            fast = fast.next; //we are using the fast variable to point to the first value to be swaped
        }
        ListNode first = fast;//we are storing the kth value from the begining

        while(fast.next != null){ //This we are using to get the kth value from end
            slow = slow.next;
            fast = fast.next;
        }
        //Now Swap the values both the nodes
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;

        return head;
    }
}