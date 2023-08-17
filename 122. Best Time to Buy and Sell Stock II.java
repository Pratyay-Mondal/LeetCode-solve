class Solution {
    public int maxProfit(int[] prices) {
        
        int len = prices.length;

        if(len == 1)
            return 0;

        int maxProfit =0;

        for(int i=0; i<len-1; i++){
            maxProfit += Math.max(0, prices[i+1] - prices[i]);
            
        }

        return maxProfit;
    }
}
