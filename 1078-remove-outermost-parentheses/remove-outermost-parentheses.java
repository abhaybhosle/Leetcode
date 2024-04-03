class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    result.append(ch);
                }
                balance++;

            } else if (ch == ')') {
                balance--;
                if (balance > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();

    }
}
/*
 * Certainly! Here's a brief explanation of the logic:
 * 
 * 1. We iterate through the characters of the input string.
 * 2. We maintain a balance variable to keep track of the balance of
 * parentheses.
 * 3. When encountering an opening parenthesis '(', if it's not the outermost
 * one (i.e., when `balance > 0`), we append it to the result.
 * 4. When encountering a closing parenthesis ')', we decrement the balance. If
 * it's not the outermost closing parenthesis (i.e., when `balance > 0`), we
 * append it to the result.
 * 5. Finally, we return the result string after removing the outermost
 * parentheses of every primitive string.
 */