
class Solution {
    public String removeKdigits(String num, int k) {

        // Base case check: if k is equal to the length of num or greater, the entire
        // number needs to be removed.
        if (k == num.length() || k > num.length()) {
            return "0";
        }

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            // Removing digits from the stack if the current digit is smaller and there are
            // remaining digits to be removed.
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            // Pushing the current digit onto the stack.
            st.push(ch);
        }

        // Removing remaining digits from the stack if necessary.
        while (!st.isEmpty() && k > 0) {
            st.pop();
            k--;
        }

        // Building the result string by appending digits from the stack in reverse
        // order.
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        // Reversing the result string to obtain the minimized number.
        sb.reverse();

        // Removing leading zeros from the result.
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Returning the final minimized number as a string.
        return sb.toString();
    }
}

/*
 ** 
 * Approach:**
 * 1. **Base Case Check:**
 * - If `k` is equal to the length of the number or greater, return "0" since
 * the entire number needs to be removed.
 * 
 * 2. **Use a Stack:**
 * - Use a stack to keep track of digits in a way that facilitates the removal
 * of less significant digits to minimize the number.
 * 
 * 3. **Iterate Through Digits:**
 * - Iterate through each digit in the given number.
 * - Compare the current digit with the digits at the top of the stack.
 * - If the current digit is smaller and there are remaining digits to be
 * removed (`k > 0`), pop digits from the stack until a smaller or equal digit
 * is encountered or `k` becomes zero.
 * 
 * 4. **Remove Remaining Digits:**
 * - After iterating through all digits, if there are still remaining digits to
 * be removed (`k > 0`), remove the remaining digits from the stack.
 * 
 * 5. **Build Result String:**
 * - Build the result string by appending digits from the stack in reverse order
 * (least significant digit first).
 * 
 * 6. **Remove Leading Zeros:**
 * - Remove any leading zeros from the result.
 * 
 * 7. **Return Result:**
 * - Return the final minimized number as a string.
 ** 
 * Time Complexity:** O(N), where N is the number of digits in the input number.
 ** 
 * Space Complexity:** O(N), where N is the number of digits in the input number
 * (used for the stack and result string).
 */