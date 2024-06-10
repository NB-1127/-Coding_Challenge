public class BubbleSort {


    // time complexity is O(n^2)
    public static void bubbleSort(int arr[]){

        for(int trun=0; trun<arr.length-1; trun++){ // 5-1=4

            for (int i = 0; i < arr.length-1-trun; i++) { //5-1-0=4 , 5-1-1=3 ,5-1-2=2, 5-1-3=1 // loop will run on the 4 times
                
                if (arr[i] > arr[i+1]) {

                    //swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    
                }
            }
        }

    }
    public static void printArr(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};

        bubbleSort(arr);
        printArr(arr);
    }
}
