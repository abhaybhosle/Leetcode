class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) { //TC - O(n)
            return "";
        }

        // Take the first string as the initial prefix
        String prefix = strs[0];

        // Iterate through the array of strings starting from the second string
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            
            // Compare characters of the prefix and the current string
            int j = 0;
            while (j < prefix.length() && j < current.length() && prefix.charAt(j) == current.charAt(j)) {
                j++;
            }

            // Trim the prefix if it doesn't match with the current string
            prefix = prefix.substring(0, j);

            // If prefix becomes empty, break early (no common prefix)
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }
}

/*
 * class Solution {
 * public String longestCommonPrefix(String[] strs) {
 * Arrays.sort(strs);
 * 
 * String s1 = strs[0];
 * String s2 = strs[strs.length-1];
 * 
 * int indx = 0;
 * 
 * while(indx < s1.length() && indx < s2.length()){
 * if(s1.charAt(indx) == s2.charAt(indx)){
 * indx++;
 * }else{
 * break;
 * }
 * 
 * }
 * return s1.substring(0,indx);
 * }
 * }
 */