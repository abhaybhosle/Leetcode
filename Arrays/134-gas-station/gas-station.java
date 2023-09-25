class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current = 0;           // Keeps track of the current gas surplus/deficit.
        int totalFuel = 0, totalCost = 0; // Calculate the total gas and total cost.
        int start = 0;             // The starting gas station index.

        // Calculate the total gas available (totalFuel) and the total cost (totalCost).
        for (int i = 0; i < gas.length; i++) {
            totalFuel += gas[i];
            totalCost += cost[i];
        }

        // If the total available gas is less than the total cost, it's impossible to complete the circuit.
        if (totalFuel < totalCost) {
            return -1;
        }

        // Iterate through the gas stations to find the starting point.
        for (int i = 0; i < gas.length; i++) {
            current += (gas[i] - cost[i]); // Update the current gas surplus/deficit.

            // If the current surplus/deficit is negative, it means we can't start from the current station.
            // Therefore, we update the start to the next station and reset the current surplus/deficit.
            if (current < 0) {
                start = i + 1; // Move to the next station.
                current = 0;   // Reset the current surplus/deficit to zero.
            }
        }

        // The 'start' variable now contains the index of the starting gas station.
        return start;
    }
}
