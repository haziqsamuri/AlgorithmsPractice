class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices.length == 1){
            return 0;
        }
        
        int lowestPrice = prices[0];
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++){
            maxProfit = prices[i] - lowestPrice > maxProfit ? prices[i] - lowestPrice : maxProfit;
            lowestPrice = prices[i] < lowestPrice ? prices[i] : lowestPrice;
        }
        return maxProfit;
    }
}