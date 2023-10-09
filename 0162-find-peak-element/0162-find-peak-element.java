class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0; // There is only one element, and it is the peak.
        }

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid; // Found a peak element
            } else if (mid > 0 && nums[mid] < nums[mid - 1]) {
                high = mid - 1; // Go left
            } else {
                low = mid + 1; // Go right
            }
        }

        return -1; // No peak element found
    }
}
/*
Approach for Finding a Peak Element in an Array using Binary Search:

1. Start by determining the length of the input array, `nums`, denoted as `n`.

2. Handle special cases:
   - If `n` is equal to 1, return 0 since there's only one element in the array, and it is the peak.
   - Check if the first element (`nums[0]`) is greater than the second element (`nums[1]`). If it is, return `nums[0]` as it is a peak.
   - Similarly, check if the last element (`nums[n-1]`) is greater than the second-to-last element (`nums[n-2]`). If it is, return `nums[n-1]` as it is a peak.

3. Initialize two pointers, `low` and `high`, to search for the peak within the subarray `nums[low...high]`. Initially, set `low` to 0 and `high` to `n - 1`.

4. Enter a while loop with the condition `low <= high` to perform binary search.

5. In each iteration of the loop, calculate the middle index, `mid`, as `(low + high) / 2`.

6. Check if `nums[mid]` is a peak:
   - If `mid` is the first element (`mid == 0`) or `nums[mid]` is greater than its left neighbor (`nums[mid - 1]`) and also greater than its right neighbor (`nums[mid + 1]` if it exists), then `mid` is a peak, and return it as the index of the peak element.

7. If `nums[mid]` is not a peak, adjust the search range:
   - If `nums[mid]` is less than its left neighbor (`nums[mid - 1]`), set `high` to `mid - 1` to search in the left half of the array.
   - Otherwise, set `low` to `mid + 1` to search in the right half of the array.

8. Repeat the binary search until a peak element is found or until `low` becomes greater than `high`.

9. If no peak element is found within the loop, return -1 to indicate that there is no peak in the array.

 */