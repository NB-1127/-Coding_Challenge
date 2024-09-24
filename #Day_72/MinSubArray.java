// Details:
// Given an array of size N and an integer K such that (K < N) , the task is to find the subsequence of K length of this array such that the sum of this subsequence is minimum possible.

// 	Test Cases:
// 	Input:
// 	[1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8]
// 	K = 3

// 	Output:
// 	The sequence of length K = 3 with minimum sum is [6, 3, 2] with sum = 11.
public class MinSubArray {

    public static int sumMinArray(int arr[], int k){
       
        
        int min= Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length-k; i++) {
            int currcount=0;
            for (int j = i; j <i+k; j++) {
                currcount += arr[j];
            }
            System.out.println(currcount);
            if (min > currcount) {
                min = currcount;
            }

        }
        return min;

    }


    public static void main(String[] args) {
        int arr[]={1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8};
        int k=3;
        System.err.println("Minimum SumOf SubArray is := "+sumMinArray(arr, k));
    }
    
}
