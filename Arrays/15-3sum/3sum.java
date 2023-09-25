/*
Approach for this Problem:
1.Sort the input array.
2.Initialize a Set to store the unique triplets and an output List<List to store the final result.
3.Iterate through the array with a variable i, starting from index 0.
4.Initialize two pointers, j and k, with j starting at i+1 and k starting at the end of the array.
5.In the while loop, check if the sum of nums[i], nums[j], and nums[k] is equal to 0. If it is, insert the triplet into the set and increment j and decrement k to move the pointers.
6.If the sum is less than 0, increment j. If the sum is greater than 0, decrement k.
7.After the while loop, iterate through the set and add each triplet to the result list<list.
Return the result list
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0 ; i < nums.length;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum < target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        result.addAll(s);
        return result;
    }
}