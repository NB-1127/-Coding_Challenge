public class StockPrice_Max {

    public static int findStockMax_value(int prices[]){
        int buying_price=Integer.MAX_VALUE;
        int Max_profit=0;
        for (int i = 0; i < prices.length; i++) {
            
            if (buying_price < prices[i]) {

                int profit= prices[i]-buying_price;// todays profit
                Max_profit=Math.max(Max_profit, profit);// this is all over profit of maximum

            }else{
                buying_price=prices[i];
            }
        }
        return Max_profit;

    } 
public static void main(String[] args) {
    int prices[]={7,1,5,3,6,4};

    int ans=findStockMax_value(prices);

    System.out.println("Maximum profit is : "+ ans);
}

}