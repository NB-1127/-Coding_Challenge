public class RecursionLastOccurence {


    
    public static int lastOccurence(int arr[], int i, int key){
        //Base Case
        if (i==arr.length) {
            return -1;
        }
        int isfound= lastOccurence(arr, i+1, key);
        if ( isfound ==-1 && arr[i] == key) {
            return i;
            
        }
       return isfound;
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        
        System.out.println(lastOccurence(arr, 0, 5));
    }
    
}
