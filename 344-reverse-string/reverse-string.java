class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters at the left and right indices
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            
            // Move the left pointer to the right and the right pointer to the left
            left++;
            right--;
        }
    }
}
