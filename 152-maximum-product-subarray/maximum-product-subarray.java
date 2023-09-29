class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;

            pre *= nums[i];
            suff *= nums[n - i - 1];
            
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
}

/*
1) We will first declare 2 variables i.e. ‘pre’(stores the product of the prefix subarray) and ‘suff’(stores the product of the suffix subarray). They both will be initialized with 1(as we want to store the product).
2) Now, we will use a loop(say i) that will run from 0 to n-1.
3) We have to check 2 cases to handle the presence of 0:
a)If pre = 0: This means the previous element was 0. So, we will consider the current element as a part of the new subarray. So, we will set ‘pre’ to 1.
b)If suff = 0: This means the previous element was 0 in the suffix. So, we will consider the current element as a part of the new suffix subarray. So, we will set ‘suff’ to 1.
4)Next, we will multiply the elements from the starting index with ‘pre’ and the elements from the end with ‘suff’. To incorporate both cases inside a single loop, we will do the following:
a)We will multiply arr[i] with ‘pre’ i.e. pre *= arr[i].
b)We will multiply arr[n-i-1] with ‘suff’ i.e. suff *= arr[n-i-1].
5)After each iteration, we will consider the maximum among the previous answer, ‘pre’ and ‘suff’ i.e. max(previous_answer, pre, suff).
6)Finally, we will return the maximum product.
     */