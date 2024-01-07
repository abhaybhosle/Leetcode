class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Create a HashSet to store elements within the current window
        Set<Integer> window = new HashSet<>();
        
        // Initialize left pointer and iterate through the array with right pointer
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            
            // If the size of the window exceeds the specified range (k),
            // remove the leftmost element from the window and increment the left pointer
            if (window.size() > k) {
                window.remove(nums[left]);
                left++;
            }

            // If the current element is already in the window, a duplicate is found,
            // so return true
            if (window.contains(nums[right])) {
                return true;
            }

            // Add the current element to the window
            window.add(nums[right]);
        }

        // If the loop completes without finding any duplicates, return false
        return false;
    }
}
