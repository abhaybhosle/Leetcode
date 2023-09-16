class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0; // If the array is already at the destination or empty, no jumps needed.
        }

        int jumps = 0;
        int maxReach = 0; // Maximum index that can be reached with the current number of jumps.
        int nextJump = 0; // Maximum index that can be reached with the next jump.

        for (int i = 0; i < n - 1; i++) {
            nextJump = Math.max(nextJump, i + nums[i]);

            if (i == maxReach) {
                jumps++;
                maxReach = nextJump;

                // If we can reach the last index, we don't need to continue further.
                if (maxReach >= n - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}
