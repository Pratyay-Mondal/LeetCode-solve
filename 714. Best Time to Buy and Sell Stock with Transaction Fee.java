class Solution {
    public int maxProfit(int[] prices, int fee) {
        int max=0, min=Integer.MIN_VALUE;

        for(int price : prices){
            int prev = max;
            max=Math.max(max, min+price);
            min=Math.max(min, prev-price-fee);
        }
      
        return max;
        
    }
}
