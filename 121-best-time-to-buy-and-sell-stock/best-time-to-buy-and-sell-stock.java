class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int min = prices[0];
        int max = -1;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                max = -1;
            }
            else if (prices[i] >= max) {
                max = prices[i];
                if (max - min > sum) sum = max - min;
            }
        }
        return sum;
    }
}