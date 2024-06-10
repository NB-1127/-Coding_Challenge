public class StockMax_price {

    public static int findStockMaxvalue(int prices[]){
        int buyingprice=Integer.MAX_VALUE;

        int maxprofit=0;

        for (int i = 0; i < prices.length; i++) {
            
            if (buyingprice < prices[i]) {

                int profit= prices[i] - buyingprice; // TOday's Profit 

                maxprofit=Math.max(maxprofit, profit); // All over profit to get Max Profit in it
                
            }else{

                buyingprice=prices[i];
            }
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        
        int prices[]={7,6,4,3,1};

        int result=findStockMaxvalue(prices);
        System.out.println("Maximum profit is : " + result);

        
    }
}
