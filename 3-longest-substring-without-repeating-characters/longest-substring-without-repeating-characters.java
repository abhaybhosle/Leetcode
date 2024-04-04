/*
1.We use a set (charSet) to keep track of unique characters in the current substring.
2.We maintain two pointers, left and right, to represent the boundaries of the current substring.
3.The maxLength variable keeps track of the length of the longest substring encountered so far.
4.We iterate through the string using the right pointer.
5.If the current character is not in the set (charSet), it means we have a new unique character.
6.We insert the character into the set and update the maxLength if necessary.
7.If the character is already present in the set, it indicates a repeating character within the current substring.
8.In this case, we move the left pointer forward, removing characters from the set until the repeating character is no longer present.
9.We insert the current character into the set and continue the iteration.
10.Finally, we return the maxLength as the length of the longest substring without repeating characters. */

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