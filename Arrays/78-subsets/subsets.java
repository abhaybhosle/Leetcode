

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         // Create a list to store all subsets
        List<List<Integer>> result = new ArrayList<>();

        // Create a list to represent the current subset being considered
        List<Integer> tempSet = new ArrayList<>();
        
        backtracking(result,tempSet,0,nums); //start backtracking from the beginning
        return result;
    }
    private void backtracking(List<List<Integer>> result,List<Integer> tempSet,int start,int nums[]){
        //add the set to the result set
        result.add(new ArrayList<>(tempSet));

        for(int i = start; i < nums.length;i++){
            //case of including the number
            tempSet.add(nums[i]);

            //backtrack the new subset
            backtracking(result,tempSet,i+1,nums);

            //case of not including the number
            tempSet.remove(tempSet.size()-1);

        }
    }
}
