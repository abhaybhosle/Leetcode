
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int majorityElement = 0;
        int majorityCount = 0;

        // Find the element with majority occurrences
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > majorityCount) {
                majorityElement = entry.getKey();
                majorityCount = entry.getValue();
            }
        }

        return majorityElement;
    }
}