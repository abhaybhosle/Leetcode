class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        
        // Initialize prefixSumCount with 0 to handle subarrays starting from the beginning
        prefixSumCount.put(0, 1);
        
        for (int num : nums) {
            sum += num;
            
            // Check if there is any prefix sum that makes the current sum - goal
            count += prefixSumCount.getOrDefault(sum - goal, 0);
            
            // Update prefixSumCount
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}
