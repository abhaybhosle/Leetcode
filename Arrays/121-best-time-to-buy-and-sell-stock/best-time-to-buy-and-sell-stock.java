class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i = 0 ; i < prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }else{

                int potentialProfit = prices[i]-minprice;
                
                if(potentialProfit > Maxprofit){
                    Maxprofit = potentialProfit;
                }
            }
        }
        return Maxprofit;
    }
}