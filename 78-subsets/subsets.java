import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Create a list to store all subsets
        List<List<Integer>> result = new ArrayList<>();
        // Create a list to represent the current subset being considered
        List<Integer> currentSubset = new ArrayList<>();
        // Start the subset generation process
        generateSubsets(nums, 0, currentSubset, result);
        // Return the list of all subsets
        return result;
    }

    // Recursive function to generate subsets
    private void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> result) {
        // Add the currentSubset to the result as a new subset
        result.add(new ArrayList<>(currentSubset));

        // Generate subsets by including nums[index] and recursively exploring
        for (int i = index; i < nums.length; i++) {
            // Include the current element in the currentSubset
            currentSubset.add(nums[i]);
            // Recursively generate subsets starting from the next index
            generateSubsets(nums, i + 1, currentSubset, result); // Recursive call
            // Backtrack: Remove the last element to explore other combinations
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
