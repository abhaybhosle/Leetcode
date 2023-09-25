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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        // Dummy -> node
         
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1; //dummy -> l1(1)
                list1 = list1.next;//move to the next node
                //note here we are moving only the list1 (criss cross comparision)
            }else{
                curr.next = list2; //dummy -> l1(1) ->l2(1)(since 2(l1)>1(l1))
                list2 = list2.next;

            }
            curr = curr.next;
        }
         curr.next = list1 != null ? list1:list2;
         return dummy.next;
    }
}