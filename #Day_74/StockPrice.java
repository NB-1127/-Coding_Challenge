public class StockPrice {

    public static int stackPriceMaxPro(int prices[]){

        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit= prices[i]-buyprice;// per day
                maxprofit=Math.max(maxprofit, profit); // overall maximum profit
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum Profit price is :" + stackPriceMaxPro(prices));
    }
    
}
