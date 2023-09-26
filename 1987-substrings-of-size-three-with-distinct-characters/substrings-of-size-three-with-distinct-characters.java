class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for(int i = 0; i < n-2;i++){
            char first = s.charAt(i);
            char second = s.charAt(i+1);
            char third = s.charAt(i+2);

            if(first != second && second != third && third != first){
                count++;
            }
        }
        return count;
    }
}