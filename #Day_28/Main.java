import java.util.Scanner;
class Main {
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        int[] res = new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<n){
            res[k] = arr1[i];
            i++;
            k++;
        }

        while(j<m){
            res[k] = arr2[j];
            j++;
            k++;
        }

        return res;
    }

    public static int[] mergeSort(int[] arr, int si, int ei){
        if(si == ei){
            int[] ba = new int[1];
            ba[0] = arr[si];

            return ba;
        }
        int mid = (si+ei)/2;

        int[] left = mergeSort(arr, si, mid);
        int[] right = mergeSort(arr, mid+1, ei);

        int[] res = mergeTwoSortedArrays(left,right);
        return res;
    }

    static int count = 0;
    public static int[] mergeTwoSortedArrays2(int[] left, int[] right){
        int n = left.length;
        int m = right.length;

        int[] res = new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(left[i] < right[j]){
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                count += (n-i);
                j++;
            }
            k++;
        }

        while(i<n){
            res[k] = left[i];
            i++;
            k++;
        }

        while(j<m){
            res[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    public static int[] countInversions(int[] arr, int si, int ei){
        if(si == ei){
            int[] ba = new int[1];
            ba[0] = arr[si];

            return ba;
        }
        int mid = (si+ei)/2;

        int[] left = countInversions(arr, si, mid);
        int[] right = countInversions(arr, mid+1, ei);

        int[] res = mergeTwoSortedArrays2(left,right);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        int[] res = countInversions(arr,0,4);
        // int[] arr2 = {2,4,7,10,18,20};

        // int[] res = mergeTwoSortedArrays(arr1,arr2);

        // for(int i=0; i<res.length; i++){
        //     System.out.print(res[i]+" ");
        // }
        System.out.println(count);
    }
}