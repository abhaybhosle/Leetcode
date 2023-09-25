class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);
            // b a  b    odd length palindrome
            //   ij
            int len2 = expandFromCenter(s, i, i + 1);
            //  b a a b     even length palindrome
            //    i j

            int len = Math.max(len1, len2);

            if (len > end - start) { //if my desired (palindromer)substring is lesser than the len  than update start and end
                start = i - (len - 1) / 2; //start index (if i am at ith position than for start i am going backward)
                end = i + len / 2; //end index(and in this case i am moving forward)
            }
        }
        return s.substring(start, end + 1);
    }

    int expandFromCenter(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) { //while expanding dont go out of bound
            i--;
            j++;
        }
        return j - i - 1; // Corrected this line
    }
}
