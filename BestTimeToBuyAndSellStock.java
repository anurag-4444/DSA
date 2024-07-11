package Leetcode_Interview_Questions;

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            minPrice = min(minPrice, prices[i]);
            int diff = Math.abs(minPrice - prices[i]);
            maxProfit = max(maxProfit, diff);
        }
        return maxProfit;
    }

    public int min(int a, int b){
        if(a < b) return a;
        return b;
    }

    public int max(int a, int b){
        if(a > b) return a;
        return b;
    }
}
