class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        // Place the pointer j at the first zero element:
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // If there are no zero elements, return the original array:
        if (j == -1)
            return;

        // Move the pointers i and j and swap non-zero elements:
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                // Swap nums[i] and nums[j]:
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
