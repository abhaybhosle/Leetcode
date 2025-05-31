class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        //pehle total cost nikalo
        for(int val:cost){
            totalCost += val;
        }
        //pehle total gas cost nikalo
        for(int val:gas){
            totalGas += val;
        }
        //base case
        if(totalGas < totalCost){
            return -1;
        }
        //logic
        int start = 0;
        int currGas = 0;
        for(int i = 0; i < gas.length; i++){
            currGas += gas[i] - cost[i]; //main logic
            if(currGas < 0){
                start = i+1;
                currGas = 0;
            }
        }
        return start;
    }
}
/*Main Logic
currGas += gas[i] - cost[i];
Jab currGas is value negative hogi(that means vo index nhi h) , then we shd move to next index.
*/