class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}