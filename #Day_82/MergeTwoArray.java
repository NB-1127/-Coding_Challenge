import java.util.Arrays;

public class MergeTwoArray {

    public static int[] mergeArray(int arr1[], int arr2[]){
        int n1=arr1.length;
        int n2=arr2.length;
        
        int[] mergearray= new int[n1 + n2];


        int i=0 , j=0, k=0;

        while ( i< n1 && j< n2) {
            if (arr1[i] <= arr2[j]) {
                mergearray[k]=arr1[i];
                k++;
                i++;
            }else{
                mergearray[k]= arr2[j];
                k++;
                j++;
            }
        }

        while (i< n1) {
            mergearray[k++]=arr1[i++];
        }

        while (j < n2) {
            mergearray[k++]=arr2[j++];
        }
        return mergearray;
    }
    

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] result= mergeArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}
