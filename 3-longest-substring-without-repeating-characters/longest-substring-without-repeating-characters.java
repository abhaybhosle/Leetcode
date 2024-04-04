
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            while (set.contains(currChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currChar);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
/*
 * At each step, the right pointer moves forward, and the characters encountered
 * are added to a set.
 * If a character is already present in the set, it indicates a repeating
 * character. In this case, characters are removed from the set and the left
 * pointer is incremented until the repeating character is no longer present in
 * the set.
 * Throughout this process, the length of the current substring without
 * repeating characters is continuously updated.
 * The maximum length encountered is tracked, providing the length of the
 * longest substring without repeating characters in the given string s.
 */