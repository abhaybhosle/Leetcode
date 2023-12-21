class Solution {
public int[] topKFrequent(int[] nums, int k) {
    // Step 1: Create an array of lists (buckets) to store elements with the same frequency
    List<Integer>[] bucket = new List[nums.length + 1];
    
    // Step 2: Create a frequency map to store the frequency of each element in the array
    Map<Integer, Integer> frequencyMap = new HashMap<>();
    for (int n : nums) {
        frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
    }

    // Step 3: Fill the buckets based on the frequency of elements
    for (int key : frequencyMap.keySet()) {
        int frequency = frequencyMap.get(key);
        if (bucket[frequency] == null) {
            bucket[frequency] = new ArrayList<>();
        }
        bucket[frequency].add(key);
    }

    // Step 4: Traverse the buckets in reverse order to get the top k frequent elements
    int[] res = new int[k];
    int counter = 0;
    for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
        if (bucket[pos] != null) {
            for (Integer integer : bucket[pos]) {
                res[counter++] = integer;
            }
        }
    }
    
    // Step 5: Return the result array
    return res;
}

}