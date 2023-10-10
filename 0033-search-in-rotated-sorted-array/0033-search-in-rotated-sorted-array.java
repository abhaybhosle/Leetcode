class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target <= nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
/*


Algorithm:
1. Place the 2 pointers i.e. low and high: Initially, we will place the pointers like this: low will point to the first index, and high will point to the last index.
2. Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula:
   - mid = (low + high) // 2 (‘//’ refers to integer division)
3. Check if arr[mid] == target: If it is, return the index mid.
4. Identify the sorted half, check where the target is located, and then eliminate one half accordingly:
   - If arr[low] <= arr[mid]: This condition ensures that the left part is sorted.
     - If arr[low] <= target && target <= arr[mid]: It signifies that the target is in this sorted half. So, we will eliminate the right half (high = mid - 1).
     - Otherwise, the target does not exist in the sorted half. So, we will eliminate this left half by doing low = mid + 1.
   - Otherwise, if the right half is sorted:
     - If arr[mid] <= target && target <= arr[high]: It signifies that the target is in this sorted right half. So, we will eliminate the left half (low = mid + 1).
     - Otherwise, the target does not exist in this sorted half. So, we will eliminate this right half by doing high = mid - 1.
5. Once the ‘mid’ points to the target, the index will be returned.
6. This process will be inside a loop, and the loop will continue until low crosses high. If no index is found, we will return -1.
 */