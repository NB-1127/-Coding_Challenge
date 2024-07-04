public class MergeSort1 {

    //Time Complexity is: O(nlog n)
    //Space Complexity is : o(n)
    public static void mergeSort(int arr[], int si, int ei){
        //Base case
        if (si >= ei) {
            return;
        }
        //Kaam
        int mid=si+(ei-si)/2; // another way is (si-ei)/2
        mergeSort(arr, si, mid); // to sort left part
        mergeSort(arr, mid+1, ei); // to sort right part
        merge(arr, si, mid, ei); // to merge array
    }
    public static void merge(int arr[], int si, int mid, int ei){

        int temp[]= new int[ei-si+1];

        int i=si; // iterator for the left part
        int j=mid+1; // iterator for the right part
        int k=0; // iterator for the temp array

        while (i <= mid && j <=ei) {
            
            if (arr[i] < arr[j]) {
                temp[k]=arr[i];
                i++;
                                
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;

        }
        //Left part
        while (i <= mid) {
            temp[k++]= arr[i++]; // otherwise we can right that is i++; k++;
            
        }
        //Right Part
        while (j <= ei) {
            temp[k++]= arr[j++]; //otherwise we can right that j++; k++;
            
        }

        //Copy temp array to the original Array
        for (k = 0, i=si; k < temp.length; k++, i++) {
            arr[i]=temp[k];
        }
    }
    public static void printLn(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,8,5,19,3,2,0,1};
        mergeSort(arr, 0, arr.length-1);
        printLn(arr);
    }
    
}
