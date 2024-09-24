public class MiniSumSubArray {

    public static int minSumSubArray(int arr[], int k){
        
        int mincount=Integer.MAX_VALUE;

        for (int i = 0; i <=arr.length-k; i++) {
            int currcount=0;
            for (int j = i; j <i+k; j++) {
                currcount +=arr[j];
            }
            if (mincount > currcount) {
                mincount= currcount;
            }
        }
        return mincount;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8};
        int k=3;
        System.out.println(minSumSubArray(arr, k));
    }
    
}
