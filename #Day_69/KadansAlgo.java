public class KadansAlgo {


    public static void kadans(int arr[]){
        int currSum=0;
        int max=Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            currSum +=arr[i];
            if (currSum < 0) {
                currSum=0;
            }
             max= Math.max(max, currSum);

        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        int arr[]={-2,-1,4,-1,-1,5,-3};
        kadans(arr);
    }
    
}
