// Details
// Write a function that takes input as an array of integers and returns the second largest integer inside the array. Do not SORT the array for solving this problem.

// Test cases for candidate
// Input: {3, 5, 7, 1, 10, 14, 6}, Output: 10
public class SecondLargestNum {

    public static int secoundLNum(int arr[]){
        int largest= Integer.MIN_VALUE;
        int secondL=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondL=largest;
                largest= arr[i];
            }else if (secondL <= arr[i] && arr[i]!= largest) {
                secondL=arr[i];
            }

        }
        return secondL;
    }
    
    public static void main(String[] args) {
        int arr[]={3, 5, 7, 1, 10, 14, 6};
        System.out.println(secoundLNum(arr));
    }
}
