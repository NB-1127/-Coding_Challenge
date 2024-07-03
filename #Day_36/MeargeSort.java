public class MeargeSort {

    //Complexity of merge sort is : O(nlogn)
    //Space Complexity is: O(n)
    public static void printLn(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void  meargeSort(int arr[] , int si, int ei){
        //Base case
        if (si >= ei) { //if the first value is greater than the second then loop to return
            return;
        }

        int mid= si + (ei-si)/2;// (si+ei)/2
        meargeSort(arr, si, mid);// Sort the left part
        meargeSort(arr, mid+1, ei); // Sort the right part
        merge(arr, si, mid, ei); // mearge part
    }
    public static void merge(int arr[],int si, int mid, int ei){

        int temp[]= new int[ei-si+1];// temparary array

        int i=si;// iterator left
        int j=mid+1; //iterator right
        int k=0; // temp array
        while (i <= mid && j <= ei) {

            if(arr[i] < arr[j]){
            temp[k]=arr[i];
            i++;
              
        }else{
            temp[k]=arr[j];
            j++;
        }
        k++;
    }
    //left Part
    while (i <= mid) {
        temp[k]=arr[i];
        i++; k++;
        
    }
    //Right Part
    while (j <= ei) {
        temp[k]=arr[j];
        j++; k++;
        
    }
    // copy temp to the main array
    for (k= 0, i=si; k <temp.length; k++, i++ ) {
        arr[i]= temp[k];
        
    }



    }
    public static void main(String[] args) {
        int arr[]={2,6,3,8,9,5};
        meargeSort(arr, 0, arr.length-1);
        printLn(arr);
    }
}