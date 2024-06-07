public class StockPrice {


    //time Complexity is : O(n)
    //stock market price 
    //profit= selling price - buying price
    //we want to maximum profit  

    public static int staickPrice(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int max_price=0;

        for (int i = 0; i < price.length; i++) {
            
            if (buyprice < price[i]) {
                
                int profit=  price[i] -buyprice; //profit formula
                //calculate maximum profit price
                max_price=Math.max(max_price, profit);
            }
            else{
                buyprice= price[i];
            }
        }
        return max_price;

    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        
        System.out.println(staickPrice(price));
    }
    
}
