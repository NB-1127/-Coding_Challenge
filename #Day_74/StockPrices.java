// Question 3:You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
// Return the maximum profit you can achieve from this transaction. 
// If you cannot achieve any profit, return 0. 
// Example 1:Input:prices = [7, 1, 5, 3, 6,  4]   
// Output:   5 
// Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. 
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
public class StockPrices {

    public static int maxprofit(int prices[]){
        int maxprofit= 0;
        int buyingprice= Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyingprice < prices[i]) {
                int profit= prices[i]- buyingprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyingprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit is :" + maxprofit(prices));

    }
    
}
