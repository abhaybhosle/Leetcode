
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int nums[], int start, List<Integer> currSubset, List<List<Integer>> result) {
        result.add(new ArrayList(currSubset));

        for (int i = start; i < nums.length; i++) {
            currSubset.add(nums[i]);
            backtrack(nums, i + 1, currSubset, result);
            currSubset.remove(currSubset.size() - 1);
        }
    }
}
