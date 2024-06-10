public class BubbleSort {

// time complexity is: O(n^2)
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        
        for(int i=0; i<n-1; i++){

            for(int j=0; j<n-1-i; j++){

                while (arr[j] < arr[j+1]) { // in decending order
                    // for ascending is vice versa of this condition

                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;  
                }
                
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
        bubbleSort(arr);
        printArr(arr);
    }
    
}
