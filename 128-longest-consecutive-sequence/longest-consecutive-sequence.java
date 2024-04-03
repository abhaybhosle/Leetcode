class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int longestSeq = 0;

        for (int num : hs) {
            if (!hs.contains(num - 1)) {
                int currNum = num;
                int currSeq = 1;

                while (hs.contains(currNum + 1)) {
                    currNum++;
                    currSeq++;
                }
                longestSeq = Math.max(currSeq, longestSeq);
            }
        }
        return longestSeq;
    }
}

/*
 * 1) HashMap banao sab numbers ka aur sabko false rakha.
 * 2) Har ek number kae liye forward direction mae check kro , agar hae toh
 * update kro varna
 * 3) reverse mae check kro
 */