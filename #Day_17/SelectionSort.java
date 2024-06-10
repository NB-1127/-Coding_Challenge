public class SelectionSort {

// time complexity is : O(n^2)
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
                int minpos=i;
                for (int j = i+1; j < arr.length; j++) {
                    
                    if (arr[minpos] > arr[j]) { //if you want to an decending order if(arr[minpos] < arr[j])
                        minpos=j;
                    }
                }  //swap          
                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1};
        selectionSort(arr);
        printArr(arr);

    }
    
}
