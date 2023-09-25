class Solution {
    public int maxArea(int[] height) {
        // Initialize two pointers, 'left' and 'right,' at the beginning and end of the array.
        int left = 0;
        int right = height.length - 1;
        // Initialize a variable to store the maximum area found.
        int maxArea = 0;

        // Continue until the 'left' pointer is less than the 'right' pointer.
        while (left < right) {
            // Calculate the current area based on the shorter line's height and width.
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            // Update 'maxArea' with the maximum of its current value and the current area.
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line inward.
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area found, which represents the maximum amount of water the container can store.
        return maxArea;
    }
}
