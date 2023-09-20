class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;//it will track the current index of String s
        if(s.length()<1){
            return true;//as empty string(' ') is also considered as subsequence part
        }
        for(int i = 0; i < t.length();i++){
            if(s.charAt(si) == t.charAt(i)){//compare the char from s to the t , if they are same then increment si to next position,if not do nothing
                si++;
            }
            if(si == s.length()){ // if si is iterated over the String s, than check if it is equal to the length of String s , the return true;
                return true;
            }
        }
        return false;
    }
}