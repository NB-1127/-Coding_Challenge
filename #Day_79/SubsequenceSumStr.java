// Details:
// Given an array of size N and an integer K such that (K < N) , the task is to find the subsequence of K length of this array such that the sum of this subsequence is minimum possible.

// 	Test Cases:
// 	Input:
// 	[1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8]
// 	K = 3

// 	Output:
// 	The sequence of length K = 3 with minimum sum is [6, 3, 2] with sum = 11.
public class SubsequenceSumStr{

    public static void subSequenceNum(int arr[], int k){
        int minimum = Integer.MAX_VALUE;
       
        for(int i=0; i<=arr.length-k; i++){
            int sumSque=0;
            for(int j=i; j< i+k; j++){
               sumSque +=arr[j];
            }
            if (minimum > sumSque) {
                minimum = sumSque;
            }
        }
        System.out.println(minimum);
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8};
        int k=3;
        subSequenceNum(arr, k);
    }
    
}
