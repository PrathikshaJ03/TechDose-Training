class Solution {
    public int maxProfit(int[] prices) {
        int profit=0,min=prices[0];
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            int p=prices[i]-min;
            profit=Math.max(profit,p);
        }
        return profit;
    }
}
