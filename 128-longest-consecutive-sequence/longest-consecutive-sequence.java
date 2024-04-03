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
