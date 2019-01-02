public class Solution {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int numToys = 0, totalPrice = 0;
        Arrays.sort(prices, 0, prices.length);
        for(int i = 0; i < prices.length; i++){
            if(totalPrice + prices[i] <= k){
                numToys++;
                totalPrice += prices[i];
            }
            else{
                break;
            }
        }
        return numToys;
    }
}