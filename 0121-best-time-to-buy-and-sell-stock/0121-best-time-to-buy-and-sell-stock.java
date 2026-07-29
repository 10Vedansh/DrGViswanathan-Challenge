class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int profit= 0;
        int minprice = prices[0];

        for(int i=0;i<prices.length;i++){
            if(minprice>prices[i]){
            minprice = prices[i];
            } 
            profit = prices[i] - minprice;

            if(profit>max){
                max = profit;
            }

        } return max;
    }
}