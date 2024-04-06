
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (!stack.isEmpty()) {
                    nge[i] = stack.peek();
                } else {
                    nge[i] = -1;
                }
            }
            stack.push(nums[i % n]);
        }
        return nge;
    }
}
/*
This code implements the Next Greater Element II problem using a stack-based approach. Here's a short summary of the approach:

1. Initialize an array `nge` to store the next greater elements for each element in the input array `nums`.
2. Create a stack to keep track of elements whose next greater element is yet to be found.
3. Iterate through the array `nums` in reverse order twice (to handle circular nature).
4. While iterating, pop elements from the stack that are smaller than or equal to the current element. These elements won't be the next greater element for any future element.
5. If the current index `i` is within the original length of `nums`, set `nge[i]` to the top element of the stack (if stack is not empty). If stack is empty, set `nge[i]` to -1, indicating no greater element found.
6. Push the current element onto the stack.
7. Return the `nge` array containing the next greater elements for each element in the input array.
*/
