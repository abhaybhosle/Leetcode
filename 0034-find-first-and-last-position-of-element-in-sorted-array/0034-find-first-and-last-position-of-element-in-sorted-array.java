class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find the starting position of the target value
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        // Find the ending position of the target value
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return result;
    }
}


/*
Time Complexity of O(log n):

**Approach:**

1. Initialize two variables, `start` and `end`, to -1. These will be used to track the starting and ending positions of the target value.

2. Use binary search to find the starting position:
   - Initialize `left` to 0 and `right` to the last index of the array.
   - While `left` is less than or equal to `right`:
     - Calculate the middle index `mid`.
     - If the element at index `mid` is equal to the target:
       - Update `start` to `mid`, indicating a potential starting position.
       - Continue searching on the left side by updating `right` to `mid - 1`.
     - If the target is less than the element at index `mid`, update `right` to `mid - 1`.
     - Otherwise, update `left` to `mid + 1`.

3. Use binary search again to find the ending position:
   - Reset `left` to 0 and `right` to the last index of the array.
   - While `left` is less than or equal to `right`:
     - Calculate the middle index `mid`.
     - If the element at index `mid` is equal to the target:
       - Update `end` to `mid`, indicating a potential ending position.
       - Continue searching on the right side by updating `left` to `mid + 1`.
     - If the target is greater than the element at index `mid`, update `left` to `mid + 1`.
     - Otherwise, update `right` to `mid - 1`.

4. Finally, return an array `[start, end]` containing the starting and ending positions of the target value. If the target is not found, both `start` and `end` will remain -1.
*/