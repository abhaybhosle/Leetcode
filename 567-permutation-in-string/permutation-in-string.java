public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean flag = false;

        Map<Character, Integer> m1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            m1.put(ch, m1.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            Map<Character, Integer> m2 = new HashMap<>();
            for (int j = i; j < i + s1.length(); j++) {
                char ch = s2.charAt(j);
                m2.put(ch, m2.getOrDefault(ch, 0) + 1);
            }
            if (m1.equals(m2)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

// Another approach :
/*
 * public boolean checkInclusion(String s1, String s2) {
 * // Get the lengths of strings s1 and s2
 * int n = s1.length();
 * int m = s2.length();
 * 
 * // Initialize an array to store the frequency of characters in s1
 * int[] freq = new int[26];
 * 
 * // Populate the frequency array for s1
 * for (int i = 0; i < n; i++) {
 * freq[s1.charAt(i) - 'a']++;
 * }
 * 
 * // Initialize an array for the frequency of characters in the current window
 * of
 * // s2
 * int[] freq2 = new int[26];
 * 
 * // Iterate through each character in s2
 * for (int i = 0; i < m; i++) {
 * // Update the frequency array for the current character in the window
 * freq2[s2.charAt(i) - 'a']++;
 * 
 * // Check if the window size is greater than or equal to the length of s1
 * if (i >= n) {
 * // Decrement the count of the character that was part of the window n
 * characters
 * // ago
 * freq2[s2.charAt(i - n) - 'a']--;
 * }
 * 
 * // Check if the frequency arrays for s1 and the current window in s2 are
 * equal
 * if (Arrays.equals(freq, freq2))
 * return true;
 * }
 * 
 * // No permutation found in any window, return false
 * return false;
 * }
 */