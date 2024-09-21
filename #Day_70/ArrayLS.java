import java.util.*;
public class ArrayLS {


    public static void smmalestSecLargestDist(int arr[]){

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        int thirdSmallest= Integer.MAX_VALUE;
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= smallest) {
                secondsmallest = smallest;
                smallest= arr[i];
            }else if(secondsmallest >= arr[i] && arr[i] != smallest){
                thirdSmallest= secondsmallest;
                secondsmallest= arr[i];
            }else if(thirdSmallest >= arr[i] && arr[i] != secondsmallest){
                thirdSmallest= arr[i];
            }
            else if(arr[i] > largest){
                largest= arr[i];
            }
        }
        System.out.println(smallest+ " "+ largest);
        int ans= largest - smallest;
        System.out.println("maximum difference in array is :"+ans);
        System.out.println("second Smallest number is : "+secondsmallest);
        System.out.println("Third smallest number is :" + thirdSmallest);
        int result= largest- secondsmallest;
        System.out.println("Second maximum difference in array is :"+ result );
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        smmalestSecLargestDist(arr);
    }
    
}
