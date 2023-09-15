class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1){
            return n;
        }
        int temp[] = new int[n];
        int count = 0;
        for(int i = 0 ; i < nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                temp[count++] = nums[i];
            }
        }
        temp[count++] = nums[n-1];
        for(int i = 0 ; i < count;i++){
            nums[i] = temp[i];
        }
        return count;
    }
}