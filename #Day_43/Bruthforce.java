public class Bruthforce {


    public static void stockC(int arr[])
    {
        int stockspam[]=new int[arr.length];
        for (int i = 0; i < stockspam.length; i++) {
            int count=0;
            for (int j = i; j >=0; j--) {
                if (stockspam[j]<= stockspam[i]) {
                    count++;
                }else{
                    break;
                }
                stockspam[i]=count;
            }
            System.out.println(stockspam[i]);
        }
        
        
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8};
        stockC(arr);
    }
    
}
