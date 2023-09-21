import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        // Call the helper function to start generating parentheses
        generateParenthesisHelper(n, n, "", result);
        return result;
    }

    private void generateParenthesisHelper(int leftCount, int rightCount, String current, List<String> result) {
        // If both leftCount and rightCount are 0, the current combination is valid
        if (leftCount == 0 && rightCount == 0) {
            result.add(current);
            return;
        }

        // Try adding an opening parenthesis '(' if there are remaining left parentheses
        if (leftCount > 0) {
            // Make a recursive call with one less leftCount and an added '(' to current
            generateParenthesisHelper(leftCount - 1, rightCount, current + "(", result);
        }

        // Try adding a closing parenthesis ')' if there are more left parentheses than right
        if (rightCount > leftCount) {
            // Make a recursive call with the same leftCount and one less rightCount and an added ')' to current
            generateParenthesisHelper(leftCount, rightCount - 1, current + ")", result);
        }
    }
}
