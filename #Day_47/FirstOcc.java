public class FirstOcc {


    public static int firstOcc(int arr[], int key , int i){
        //base case
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        
        
        return firstOcc(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,8,5,4};
        int key=5;
        System.out.println(firstOcc(arr, key, 0));
        
    }
}