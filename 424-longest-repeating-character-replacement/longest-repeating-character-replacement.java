class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26]; // Assuming only uppercase English letters
        
        int maxLength = 0;
        int maxCharCount = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charCount[currentChar - 'A']++;
            
            // Update the count of the most frequent character in the current window
            maxCharCount = Math.max(maxCharCount, charCount[currentChar - 'A']);
            
            // If the total characters in the window minus the most frequent character
            // exceed the allowed replacements (k), then shrink the window from the left
            if ((end - start + 1) - maxCharCount > k) {
                charCount[s.charAt(start) - 'A']--;
                start++;
            }
            
            // Update the maximum length of the substring
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        return maxLength;
    }
}
