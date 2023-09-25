import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert integers to strings for custom sorting
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        // Custom comparator to sort strings in descending order
        Arrays.sort(numsStr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        // Handle leading zeros
        if (numsStr[0].equals("0")) {
            return "0";
        }

        // Concatenate sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String num : numsStr) {
            result.append(num);
        }

        return result.toString();
    }
}
