public class MaxSubArray {

// time complexity is O(n^3)
    public static void sumMaxSubArray(int arr[]){
        int max_SubArray= Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                    int sum=0;
                for (int k = i; k <= j; k++) {
                    
                    sum= sum+arr[k]; // subarray sum 


                }
                System.out.println("Sum is: " + sum);
                if (max_SubArray < sum) {
                        
                    max_SubArray=sum;
                }
                
                
            }
           
        }
        System.out.println(" Maximum numbers of sum of Subarray is: " + max_SubArray);
    }
    public static void main(String[] args) {
        
        int arr[]={1, -2, 6, -1, 3};

        sumMaxSubArray(arr);
    }
}