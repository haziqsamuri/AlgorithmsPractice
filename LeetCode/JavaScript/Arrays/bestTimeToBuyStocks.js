var maxProfit = function(prices) {
    var current_profit = 0;
    var total_profit = 0;
    var highest_price = 0;
    
    for(var i = prices.length-2; i >= 0; i--){
        if(prices[i] > prices[i+1]){
            highest_price = prices[i];
            total_profit+= current_profit;
            current_profit = 0;
            
        }
        else{
            if(prices[i+1] > highest_price){
                highest_price = prices[i+1];
            }
            current_profit = highest_price - prices[i];
            
        }
        
    }
    total_profit+= current_profit;
    return total_profit;
};