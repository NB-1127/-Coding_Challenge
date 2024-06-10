public class SelectionSort {


    public static void selectionSort(int[] arr){
        int minpos=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            minpos=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpos] < arr[j]) { // for the decending order
                    // ascending order is vice versa
                    minpos=j;
                    
                }
                
            }
            //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
            
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
        printArr(arr);
    }
    
}
