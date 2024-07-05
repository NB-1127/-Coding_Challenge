/**
 * BAckTracking
 */

 //Time complexity is : O(n)
public class BAckTracking {
    public static void changeRange(int arr[], int i, int val){

        // Base case
        if (i == arr.length) {
            println(arr);// to perform the all task and reach at the base case then it print the array
            return; // and return the function start the backtraking
        }
        //Recursion
        arr[i]=val;// first index =0 the val = 1
        changeRange(arr, i+1, val+1);// then the 2,3,4... for the size it will increases by 1 and placing the appropriate value which should be given in question
        arr[i]=arr[i]-2; // after performing all task ten it return that time this condition to be performed
    }
    public static void println(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");// here we print the Backtraking array 
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[]= new int[5];
        changeRange(arr, 0, 1);
        println(arr); // here we have the change array if we return the func that time it work as backtraking to perform condition for that

    }
}