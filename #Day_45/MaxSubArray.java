public class MaxSubArray {
    public static void printSlidingWindowMaximumBruteForce(int arr[], int N, int K)
    {
        for (int i = 0; i <= N - K; i++) {
 
            int currMax = arr[i];
 
            for (int j = 1; j < K; j++) {
                if (arr[i + j] > currMax)
                    currMax = arr[i + j];
            }
            System.out.print(currMax + " ");
        }
    }
        public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int K = 3;
 
        printSlidingWindowMaximumBruteForce(arr, arr.length, K);
    }
}
    