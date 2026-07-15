class Solution {
    public int maxProfit(int[] prices) {
        int i =0;
        int maxprofit=0;
        int min=Integer.MAX_VALUE;
        while(i<prices.length){
            int profit=0;
           if(min>prices[i]){
            min=prices[i];
        }

        profit=prices[i]-min;
        
         if(profit>maxprofit){
            maxprofit=profit;
         }

           i++;
        }
      

        return maxprofit;
    }
}