public class MergeSort {

    public static void mergeSort(int arr[], int si, int ei){
        //Base case
        if (si >= ei) {
            return;
        }
        //Kaam
        int mid= si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);

    }
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]= new int[ei-si+1];

        int i= si; // iterator for the left side
        int j= mid+1; // iterator for the right side
        int k=0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k]= arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
            
        }
        //left part
        while (i <= mid) {
            temp[k++]=arr[i++];
        }
        while (j <= ei) {
            temp[k++]=arr[j++];
        }

        // copy to temp arr to original arr
        for (k= 0, i=si; k < temp.length; k++, i++) {
            arr[i]= temp[k];
        }
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]+" "); 
        }
    }


    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,4};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }
    
}
