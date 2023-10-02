/*
Certainly, here's a concise approach for finding two numbers in an array that add up to a target value with a time complexity of O(n):

1. Create a HashMap to store elements from the array along with their indices.
2. Iterate through the array once.
3. For each element, calculate the complement (target - element).
4. Check if the complement is already in the HashMap:
   - If it is, return the indices of the current element and its complement.
   - If it's not, add the current element to the HashMap.
5. If no solution is found after the iteration, return an empty array.

This approach ensures that you find a pair of elements efficiently with a single pass through the array, making it O(n) in terms of time complexity. */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }

            map.put(nums[i],i);
        }
        return new int[] {};
    }
}



/*   Brute Force - O(N2)
        int n = nums.length;
        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j < n;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
*/      