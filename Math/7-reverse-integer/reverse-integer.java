class Solution {
public int reverse(int x) {
    int reversed = 0;
    
    while (x != 0) {
        int digit = x % 10;
        
        // Check for overflow before appending the digit
        if (reversed > Integer.MAX_VALUE / 10 || 
            (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
            return 0;  // Overflow will occur
        }
        
        if (reversed < Integer.MIN_VALUE / 10 || 
            (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
            return 0;  // Overflow will occur
        }
        
        reversed = reversed * 10 + digit;
        x /= 10;
    }
    
    return reversed;
}

    
}

/*Calculate the last digit of num by taking its remainder when divided by 10. This is done using the expression int mod = num % 10;. For example, if num is 123, mod will be 3 in the first iteration.

Add the digit mod to the res variable by multiplying the current res value by 10 and then adding mod. This effectively shifts the existing digits in res one position to the left and appends the new digit. For example, if res is 0 and mod is 3, res becomes 3 in the first iteration.

Remove the last digit from num by dividing it by 10. This is done using the expression num /= 10;. For example, if num was 123, it becomes 12 in the first iteration, then 1 in the second iteration, and finally 0 when there are no more digits left.*/