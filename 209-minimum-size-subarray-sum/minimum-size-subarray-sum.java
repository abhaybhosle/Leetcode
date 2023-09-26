class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE; // Initialize the minimum length with a large value.
        int currentSum = 0; // Initialize the current sum of elements.
        int left = 0; // Initialize the left pointer.

        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right]; // Add the current element to the current sum.

            while (currentSum >= target) { // Check if the current sum is greater than or equal to the target.
                // Calculate the current subarray length and update minLength with the minimum value.
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left]; // Remove the left element from the current sum.
                left++; // Move the left pointer to contract the subarray.
            }
        }

        // Return minLength if it was updated; otherwise, return 0 (no subarray found).
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
