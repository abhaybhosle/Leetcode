class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Create a dummy head node to simplify the code.
        ListNode current = dummyHead; // Initialize a current pointer to the dummy head.

        int carry = 0; // Initialize carry to 0.

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0; // Get the current digit from l1, or 0 if l1 is null.
            int y = (l2 != null) ? l2.val : 0; // Get the current digit from l2, or 0 if l2 is null.

            int sum = carry + x + y; // Calculate the sum of the current digits and the carry.

            carry = sum / 10; // Update carry for the next iteration.

            current.next = new ListNode(sum % 10); // Create a new node for the result digit.
            current = current.next; // Move the current pointer to the next node.

            if (l1 != null) l1 = l1.next; // Move to the next digit in l1 if it exists.
            if (l2 != null) l2 = l2.next; // Move to the next digit in l2 if it exists.
        }

        if (carry > 0) {
            current.next = new ListNode(carry); // If there is a carry after the loop, create a new node for it.
        }

        return dummyHead.next; // The actual result starts from the next node of the dummy head.
    }
}
