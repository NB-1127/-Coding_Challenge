// Details
// Write a function that takes input as an array of integers and returns the second largest integer inside the array. Do not SORT the array for solving this problem.

// Test cases for candidate
// Input: {3, 5, 7, 1, 10, 14, 6}, Output: 10
public class ArraySeconL {

    public static int seconLargestEle(int arr[]){

        int largest= Integer.MIN_VALUE;
        int secoundL= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int currEle= arr[i];
            if (currEle > largest ) {
                secoundL= largest;
                largest = currEle;
            }else if(secoundL <= currEle && currEle != largest){
                secoundL = currEle;
            }
        }
        return secoundL;
    }

    public static void main(String[] args) {
        int arr[]={3, 5, 7, 1, 10, 14, 6};

        System.out.println(seconLargestEle(arr));
        
    }
}