public class CountSort {


    public static void countSort(int arr[]){
        int max_value=Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
           max_value=Math.max(max_value, arr[i]);
        }
        int counts[]=new int[max_value+1];
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i]]++;
        }
        // sorting
        int freq=0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0) {
                arr[freq] =i;
                freq++;
                counts[i]--;
            }
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,2,3,4,2,4,6,2,5};
        countSort(arr);
        printArr(arr);
    }
    
}
