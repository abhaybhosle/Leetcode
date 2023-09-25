class Solution {
    public int strStr(String haystack, String needle) {
        // Check if needle is empty
        if (needle.isEmpty()) {
            return 0; // Needle is empty, so it's always present at the beginning of haystack
        }
        
        int n = haystack.length(); // Length of haystack
        int m = needle.length();   // Length of needle
        
        // Loop through haystack with a sliding window
        for (int i = 0; i <= n - m; i++) {
            int j;
            // Compare characters in haystack and needle
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break; // Mismatch found, break the inner loop
                }
            }
            
            // Check for a complete match
            if (j == m) {
                return i; // Found a match at index i
            }
        }
        
        // No match found in haystack
        return -1;
    }
}
