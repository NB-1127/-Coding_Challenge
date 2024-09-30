// Details
// Write a function that takes input as an array of integers and returns the second largest integer inside the array. Do not SORT the array for solving this problem.

// Test cases for candidate
// Input: {3, 5, 7, 1, 10, 14, 6}, Output: 10

import java.util.Scanner;

public class ScondLargetNumArray {

    public static int secondLargestEle(int arr[]){

        int larget=Integer.MIN_VALUE;
        int secondL=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if (arr[i] > larget) {
                secondL= larget;
                larget=arr[i];
            }else if (secondL <= arr[i] && arr[i] != larget) {
                secondL= arr[i];
                
            }
        }
        return secondL;

    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]= new int[7];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Second Largest Number is :"+secondLargestEle(arr));
    }
}
