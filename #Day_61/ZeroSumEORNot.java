import java.util.HashMap;

public class ZeroSumEORNot {

    static boolean checkSum(int arr[],int n){
        int sum=0;
        HashMap<Integer,Boolean>mp=new HashMap<>();
        for (int i = 0; i < n; i++) {

            sum+=arr[i];

            if (sum==0) {
                return true;
            }
            if(mp.containsKey(sum)==true){
                return true;
            }
            else{
                mp.put(sum, true);
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr= {10,4,6,-3,-7,20};
        boolean result = checkSum(arr, arr.length);
        System.out.println("Does the array contain a zero-sum subarray? " + result);
    }
}