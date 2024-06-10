public class CountSort {



    public static void countSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest, arr[i]);
           
        }
        //System.out.println(largest); this is give which is your largest array element

        int count[]=new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            
        }

        // sorting
        int freq=0;
        for (int i = count.length-1; i >=0 ; i--) { // for the decending order we use the loop start at the last index which n-1 and go to the till 0
            while(count[i] > 0) {
                arr[freq]=i;
                freq++;
                count[i]--;

                
            }
        }
    }
    

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        countSort(arr);
        printArr(arr);
    }
    
}
