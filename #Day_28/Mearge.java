public class Mearge {


    public static int[] meargeSortMearge(int[] arr1, int[] arr2){
        int n= arr1.length;
        int m= arr2.length;

        int res[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        while (i<n && j<m) {
            if (arr1[i]< arr2[j]) {
                res[k]=arr1[i];
                i++;
            }else{
                res[k]=arr2[j];
                j++;
            }
            k++;
            
        }
        while (i<n) {
            res[k]=arr1[i];
            i++;
            k++;
            
        }
        while (j<m) {
            res[k]=arr2[j];
            j++;
            k++;
            
        }
        return res;
    }
    public static int[] meargeSort(int[] arr, int si, int ei){
        if (si==ei) {
            int[] ba= new int[1];
            ba[0]=arr[si];

            return ba;

        }
        int mid= (si+ei)/2;

        int[] left=meargeSort(arr, si, mid);
        int[] right=meargeSort(arr, mid+1, ei);

        int res[]= meargeSortMearge(left, right);

        return res;
    }
    public static void main(String[] args) {
        int arr1[]={1,5,9,13,19};
        int arr2[]={2,4,7,18,20};
        int result[]=meargeSortMearge(arr1, arr2);
       

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]+ " ");
            
        }
        int arr[]={4,5,6,3,1,2};
        int res[]= meargeSort(arr, 0, 5);
        
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]+ " ");
        }
    }
}