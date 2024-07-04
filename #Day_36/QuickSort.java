public class QuickSort {

    //tTime Complexity in Average Case: O(nlogn)
    //Time Complexity in Worst Case: O(n^2)
    //Space Complexity is : O(1)
    //Worst Case Occure when the pivot is always smallest or the largest element
    public static void quickSort(int arr[], int si, int ei){
        //Base Case
        if (si >= ei) {
            return;
        }
        //last element: pivote
        int pindx=partitioning(arr, si, ei);// to find pivot function it means last index
        quickSort(arr, si, pindx-1); // left
        quickSort(arr, pindx+1, ei); // right

    } 
    public static int partitioning(int arr[], int si, int ei){

        int pivot= arr[ei]; // last element
        int i=si-1;// to make place smaller than pivot
        
        for (int j = si; j < ei; j++) {// to point current index
            
            if (arr[j] <= pivot) {
                i++;// if the condition is true the we increases the index by 1
                // then
                //Swap
                int temp=arr[j];
                arr[j]= arr[i];
                arr[i]= temp;
                
            }
        }
        i++;
        //Swap
        // here we swap func use for the to set pivot to the right position
        int temp=pivot;
        arr[ei]= arr[i];
        arr[i]= temp;
        return i;

    }
    //Print Array
    public static void println(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={4, 6, 2, 8, 9, 5};
        quickSort(arr, 0, arr.length-1);
        println(arr);
    }
    
}
