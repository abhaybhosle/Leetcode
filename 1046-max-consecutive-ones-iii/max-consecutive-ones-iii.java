class Solution {
    public int longestOnes(int[] nums, int k) {
        //Sliding Windown apppraoch 
        int left = 0;
        int maxConsecutive1s = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxConsecutive1s = Math.max(maxConsecutive1s, right - left + 1);
        }
        return maxConsecutive1s;
    }
}
/*Approach: Sliding Window with Flips

1. Initialize two pointers, left and right, both starting at the beginning of the array.
2. Use the right pointer to expand the window until you have k or more zeros.
3. While expanding the window, keep track of the count of zeros encountered.
4. If the count of zeros exceeds k, move the left pointer to shrink the window until the count becomes valid.
5. Update the maximum consecutive ones with the current window length (right - left + 1).
6. Repeat steps 2-5 until the right pointer reaches the end of the array.
The final result is the maximum consecutive ones with at most k flips.

*/