class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = prices.length - 1; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (prices[i] - prices[j] > maxProfit) {
                    maxProfit = prices[i] - prices[j];
                }
            }
        }
        return maxProfit;
    }
}
