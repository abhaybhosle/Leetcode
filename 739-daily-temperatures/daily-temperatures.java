class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Array to store the result (number of days until the next warmer temperature)
        int ans[] = new int[temperatures.length];
        
        // Stack to keep track of indices of temperatures
        Stack<Integer> stack = new Stack<>();
        
        for (int currDay = 0; currDay < temperatures.length; currDay++) {
            // Check if the current temperature is higher than the temperature at the index stored on the top of the stack
            while (!stack.isEmpty() && temperatures[currDay] > temperatures[stack.peek()]) {
                // If the current temperature is higher, update the result array with the number of days until a warmer temperature
                int prevDay = stack.pop(); // Get the index of the previous day
                ans[prevDay] = currDay - prevDay; // Calculate the number of days until a warmer temperature
            }
            
            // Add the current day's index to the stack, as its warmer temperature is not yet found
            stack.add(currDay);
        }
        
        // Return the array containing the result for each day
        return ans;
    }
}
