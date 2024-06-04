import java.util.*;
public class SubArray {

//write a program to calculate subArray and sum of SubArray 
//And also calculate the maximum value of suba array or minimum value of subarray
//count of subArray
    public static void subArray(int[] arr){
        int tp=0; 
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i; j < arr.length; j++) {
                int sum=0;
                for (int k = i; k <=j; k++) {//print
                    
                    System.out.print(arr[k]+" ");//subarray
                    sum += arr[k]; //sum=sum+arr[k];
                    if (max < sum) {
                        max=sum;
                    }
                    if (min > sum ) {
                        min=sum;
                    }
                }
                tp++;
                System.out.print("sum is:" + sum);
               
                System.out.println();
            
            }
            System.out.println();

        }
        System.out.println("Total number od SubArray: " + tp);
        System.out.println("Maximum value of Sum of SubArray :" + max);
        System.out.println("Minimum value of Sum of SubArray :" + min);

    }
    public static void main(String[] args) {
        
        int arr[]={5,10,15,20};
        
        subArray(arr);
        
    }
    
}
