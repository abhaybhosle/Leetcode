import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // Initialize the result list to store permutations.
        List<List<Integer>> result = new ArrayList<>();
        // Initialize a list to build the current permutation.
        List<Integer> currentPermutation = new ArrayList<>();
        // Initialize a boolean array to keep track of used numbers.
        boolean[] used = new boolean[nums.length];
        
        // Start generating permutations.
        generatePermutations(nums, used, currentPermutation, result);
        
        // Return the list of permutations.
        return result;
    }
    
    private void generatePermutations(int[] nums, boolean[] used, List<Integer> currentPermutation, List<List<Integer>> result) {
        // If the current permutation is complete (length equals the input array length),
        // add a copy of it to the result list and return.
        if (currentPermutation.size() == nums.length) {
            result.add(new ArrayList<>(currentPermutation));
            return;
        }
        
        // Loop through the input array to consider all elements for the current position in the permutation.
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                // Add the current element to the current permutation.
                currentPermutation.add(nums[i]);
                // Mark the current element as used.
                used[i] = true;
                // Recursively generate permutations with the updated current permutation.
                generatePermutations(nums, used, currentPermutation, result);
                // Backtrack: Unmark the current element and remove it from the current permutation.
                used[i] = false;
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }
}
