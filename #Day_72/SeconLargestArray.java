// Details
// Write a function that takes input as an array of integers and returns the second largest integer inside the array. Do not SORT the array for solving this problem.

// Test cases for candidate
// Input: {3, 5, 7, 1, 10, 14, 6}, Output: 10
// 11 min
import java.util.*;
public class SeconLargestArray {

    public static int secondClosestNum(int arr[]){

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int thirsLargest= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i==0) {
                largest=arr[i];
                secondLargest=arr[i];
            }
            if (largest < arr[i]) {
                secondLargest = largest;
                largest= arr[i];
            }else if ((secondLargest < arr[i])  && (arr[i] != largest)) {
                
                secondLargest= arr[i];
            }
        }
        return secondLargest;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[]= new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(secondClosestNum(arr));
    }
}
