
/* The approach to generating Pascal's triangle is quite straightforward. You start with the first row, which contains only a single element, which is 1. Then, you iteratively generate each subsequent row by following these rules:

1. Each row begins and ends with the number 1.
2. The numbers in between are the sum of the two numbers directly above them in the previous row.

Here's a step-by-step breakdown of the approach:

1. Create an empty list of lists called `result` to store the rows of Pascal's triangle.

2. If `numRows` is less than or equal to 0, return an empty `result`.

3. Create the first row (`firstRow`) as a list containing a single element, which is 1.

4. Add `firstRow` to the `result` list.

5. Iterate from `i = 1` to `numRows - 1` to generate the remaining rows:

   a. Get the previous row (`prevRow`) from the `result` list, which is `result.get(i - 1)`.

   b. Create a new row (`newRow`) as an empty list.

   c. Add the first element of the row as 1.

   d. Iterate from `j = 1` to `i - 1` to generate the elements in the middle of the row:

      - Calculate the current element as the sum of the two elements directly above it in `prevRow`, i.e., `prevRow.get(j - 1) + prevRow.get(j)`.
      - Add this sum to `newRow`.

   e. Add the last element of the row as 1.

   f. Add `newRow` to the `result` list.

6. After the loop completes, you will have generated `numRows` rows of Pascal's triangle, and you can return the `result` list.

This approach ensures that each row of Pascal's triangle is generated correctly based on the rules, and the resulting list of lists represents Pascal's triangle up to the specified number of rows (`numRows`).
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows <= 0) {
            return result;
        }

        // Create the first row with a single element 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            
            // Add the first element of each row as 1
            newRow.add(1);
            
            for (int j = 1; j < i; j++) {
                // Calculate the current element as the sum of the two elements above it
                int sum = prevRow.get(j - 1) + prevRow.get(j);
                newRow.add(sum);
            }
            
            // Add the last element of each row as 1
            newRow.add(1);
            
            result.add(newRow);
        }
        
        return result;
    }
}
