class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1)
            return 0;

        int max = 0, profit = 0;

        for (int i = prices.length - 1; i >= 0; i--){
            if(max <= prices[i]){
                max = prices[i];
                continue;
            } else {
                profit = (max - prices[i]) > profit ? max - prices[i]: profit;
            }
        }

        return profit;
    }
}