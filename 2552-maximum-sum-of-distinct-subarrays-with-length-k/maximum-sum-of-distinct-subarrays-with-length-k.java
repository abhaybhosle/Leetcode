import java.util.HashSet;
import java.util.Set;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long maxSum = 0;
        long currentSum = 0;
        Set<Integer> seen = new HashSet<>();

        int left = 0;
        for (int right = 0; right < n; right++) {
            // Check if the element at nums[right] is already in the seen set or if the window size is greater than k.
            while (seen.contains(nums[right]) || (right - left + 1) > k) {
                // Remove elements from the left side of the window to maintain distinct elements and reduce window size.
                seen.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            // Add the element at nums[right] to the seen set and currentSum to maintain the window.
            seen.add(nums[right]);
            currentSum += nums[right];

            // Check if we have a valid subarray of length k with distinct elements and update maxSum if needed.
            if (seen.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
