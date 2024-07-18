public class LastOcc {

    public static int lastOcc(int arr[], int key , int i){
        //Base Case
        if (i==arr.length) {
            return -1;
        }
        int isFound= lastOcc(arr, key, i+1);
        if (isFound != -1) { // we can write (isFound == -1 && arr[i] == key) return i;
            return isFound;
        }
        if (arr[i] == key) {

            return i;
            
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={4,6,8,4,6,2};
        int key =4;
        System.out.println(lastOcc(arr, key, 0));

    }
    
}
