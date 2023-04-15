
class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int tempMin = prices[0];

        for(int i=0; i<prices.length; i++){
            if(prices[i] > tempMin){
                max = Math.max(max, (prices[i]-tempMin));
            }    
            else{
                tempMin = prices[i];
            }
        }

        return max;
    }
}


