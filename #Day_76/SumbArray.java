// Details:
// Given an array of size N and an integer K such that (K < N) , the task is to find the subsequence of K length of this array such that the sum of this subsequence is minimum possible.

// 	Test Cases:
// 	Input:
// 	[1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8]
// 	K = 3

// 	Output:
// 	The sequence of length K = 3 with minimum sum is [6, 3, 2] with sum = 11.
//5 min
public class SumbArray {

    public static void sumOfSubArrayMIn(int arr[], int k){

        int minsum=Integer.MAX_VALUE;

        for(int i=0; i<arr.length-k; i++){
            int currcount=0;
            for(int j=i; j<i+k; j++){
                currcount +=arr[j];
            }
            if (currcount < minsum) {
                minsum=currcount;
            }
        }
        System.out.println(minsum);
    }
    

    public static void main(String[] args) {
        int arr[]={1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8};
        int k=3;

        sumOfSubArrayMIn(arr, k);
    }
}
