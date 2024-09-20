// Details
// Write a function that takes input as an array of integers and returns the second largest integer inside the array. Do not SORT the array for solving this problem.

// Test cases for candidate
// Input: {3, 5, 7, 1, 10, 14, 6}, Output: 10

import java.util.Scanner;

public class ArraysL {

    public static int secL(int arr[]){

        int largesNum=Integer.MIN_VALUE;// -infinity
        int seconLarge= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            if (largesNum <= arr[i]) {
                    seconLarge=largesNum;
                    largesNum=arr[i];
            }else if(seconLarge <= arr[i] && largesNum !=arr[i]){

                seconLarge= arr[i];
            }

           
        }
        return seconLarge;
    }

    public static void main(String[] args) {
        
       

        int arr[]= {3, 5, 7, 1, 10, 14, 6};
        
        System.out.println(secL(arr));
        
        
    }
    
}
