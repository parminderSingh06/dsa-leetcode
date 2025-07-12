public class BestTimeToBuySell {

    public int maxProfit(int[] prices) {

        //Keep track of max profit so we can return 0 already if array is only 1 element.
        int maxProfit = 0;

        //Intialize the window.
        int left = 0, right = 1;

        //Keeps going until right side of window reaches the end, in which the maxprofit should have been calculated.
        while(right < prices.length){

            //This loop checks if there is a cheaper option in the next day to buy a stock and if there is then we jump to that day and buy.
            if(prices[right] < prices[left] ){
                left = right;
                right++;
            }

            //This section is for when the next day is not lower price so we just increase the window size and check if the profit we made on this day would be greater, if it is update max.
            else{
                int profit = prices[right] - prices[left];
                if(maxProfit < profit) maxProfit = profit;
                right++;
                
            }
        }

        return maxProfit;
    }
}