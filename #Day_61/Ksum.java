import java.util.HashMap;

public class Ksum {



    static boolean checkSum(int arr[], int k, int n){

        HashMap<Integer, Boolean> mp= new HashMap<>();


        int sum=0;
    
        for (int i = 0; i < n; i++) {
            sum+=arr[i];

            if (sum == k) {
                return true;


            }
            if (mp.containsKey(sum-k)==true) {
                return true;
                
            }
            else{
                mp.put(sum, true);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={10,7,4,5,20};
        int k=9;

        boolean result = checkSum(arr, k, arr.length);
        System.out.println("Does the array contain a subarray with sum " + k + "? " + result);
        
    }
    
}
