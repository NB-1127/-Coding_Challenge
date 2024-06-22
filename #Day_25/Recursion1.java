public class Recursion1 {

    public static void linearSearch(int[] arr, int key, int end){
    if (end < 0) {
            return;
        }
        if (arr[end]== key) 

            linearSearch(arr, key, end-1);

            System.out.print(end+ " ");
            
        
    }

    public static void main(String[] args) {
        int arr[]= {10 ,20 ,30, 20, 20};
        int key=20;
        linearSearch(arr, key, arr.length-1);
    }
}