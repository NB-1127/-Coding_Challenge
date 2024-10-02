// Find the kth highest element in an array.

import java.util.Arrays;

public class FindKthEleArray {

    public static int findkthele(int arr[], int k){
        Arrays.sort(arr);

         // The k-th largest element is at index (length - k) after sorting in ascending order
        return arr[arr.length-k];
    }
    

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println(findkthele(arr,k));
    }
}
