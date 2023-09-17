class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0; // Initialize the maximum reachable index.

        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the maximum reachable index, return false.
            if (i > maxReach) {
                return false;
            }

            // Update the maximum reachable index based on the current element.
            maxReach = Math.max(maxReach, i + nums[i]);

            // If the maximum reachable index is greater than or equal to the last index, return true.
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return maxReach >= nums.length - 1;
    }
}
