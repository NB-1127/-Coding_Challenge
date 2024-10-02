// Details:
// Given an array of size N and an integer K such that (K < N) , the task is to find the subsequence of K length of this array such that the sum of this subsequence is minimum possible.

// 	Test Cases:
// 	Input:
// 	[1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8]
// 	K = 3

// 	Output:
// 	The sequence of length K = 3 with minimum sum is [6, 3, 2] with sum = 11.



public class SubSequenceStr {

    public static int miniSumSubArray(int num[], int k){

        int miniSum=Integer.MAX_VALUE;

        for(int i=0; i<=num.length-k; i++){
            int sum=0;
            for(int j =i; j<i+k; j++){
                sum +=num[j];
            }
            if (sum < miniSum) {
                miniSum= sum;
            }
        }
        return miniSum;
    }

    public static void main(String[] args) {
        
        int num[]={1, 2, 9, 8, 5, 4, 3, 6, 3, 2, 8};
        int k=3;
        System.out.println(miniSumSubArray(num, k));
    }
    
}
