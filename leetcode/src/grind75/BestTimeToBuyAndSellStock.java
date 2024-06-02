package grind75;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            profit = prices[i] - minPrice;
            if(maxPrice < profit){
                maxPrice = profit;
            }
        }
        return maxPrice;
    }
}
