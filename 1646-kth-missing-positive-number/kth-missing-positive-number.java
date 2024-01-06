class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Calculate the number of missing integers between the current element and its
            // expected value
            int miss_num = arr[mid] - (mid + 1);

            // Adjust the search range based on the comparison of missing numbers with k
            if (miss_num < k) {
                // If there are fewer missing positive integers to the left of mid, update low
                low = mid + 1;
            } else {
                // If there are more or equal missing positive integers to the left of mid,
                // update high
                high = mid - 1;
            }
        }

        // Calculate and return the kth missing positive integer
        return k + high + 1;
    }
}
/*
Approach: Binary Search for Missing Positive Integers

Initialization:

Set low to 0 (index of the first element in the array).
Set high to arr.length - 1 (index of the last element in the array).
Binary Search Loop:

While low is less than or equal to high:
Calculate the middle index mid.
Calculate the number of missing positive integers, miss_num, between the current element at index mid and its expected value (mid + 1).
Adjust Search Range:

If miss_num is less than k, update low = mid + 1 since the missing integers are to the right of mid.
If miss_num is greater than or equal to k, update high = mid - 1 since the missing integers are to the left of or at mid.
Return Result:

After the loop, return k + high + 1. This value represents the kth missing positive integer, considering the last position where a missing integer was found.
*/