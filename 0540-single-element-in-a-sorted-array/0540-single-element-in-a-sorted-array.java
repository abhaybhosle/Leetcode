class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        // If there's only one element, it's the unique element
        if (n == 1) {
            return nums[0];
        }
        
        // Check if the unique element is at the beginning
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        
        // Check if the unique element is at the end
        if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }
        
        int low = 1; // Initialize the low pointer
        int high = n - 2; // Initialize the high pointer
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            // Check if nums[mid] is the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            
            // Check if the single element is on the right side
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || //even
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) { //odd
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1; // Return -1 if no single element is found (shouldn't happen given the problem's constraints)
    }
}
