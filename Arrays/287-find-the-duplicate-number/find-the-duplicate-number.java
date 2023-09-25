class Solution{
int findDuplicate(int[] nums) {
    // Initialize slow and fast pointers
    int slow = nums[0];
    int fast = nums[0];

    // Step 1: Find the intersection point of the two pointers
    do {
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while (slow != fast);

    // Step 2: Find the entrance to the cycle
    slow = nums[0];
    while (slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
    }

    // Return the repeated number
    return slow;
}
}