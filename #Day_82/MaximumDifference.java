// Maximum Difference
// You are given an array 'ARR' of the 'N' element. Your task is to find the maximum difference between any of the two elements from 'ARR'.
// If the maximum difference is even print “EVEN” without quotes. If the maximum difference is odd print “ODD” without quotes.
// For example:
// Given 'ARR' = [1, 10, 5, 2, 8, 1 ] , answer is "ODD". Here the maximum difference is between 10 and 1, 10 - 1 = 9
public class MaximumDifference {

    public static void maxDiff(int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if (arr[i] > min) {
                min =arr[i];
            }

            if (arr[i] < max) {
                max=arr[i];
            }
        }
        int maxdiffer= max -min;

        if (maxdiffer % 2 ==0) {
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 10, 5, 2, 8, 1};

        maxDiff(arr);

    }
    
}
