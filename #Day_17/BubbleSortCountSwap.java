public class BubbleSortCountSwap {


    //time Complexity is: o(n)
    public static void bubbleSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {

            int swap=0;

            for (int j = 0; j < arr.length-1-i; j++) {

                if(arr[j] > arr[j+1]){
                    
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swap++;
                }  
                
            }
            if (swap==0) {
                System.out.println("Sortated Array");
                
            }else{
                System.out.println("count of swap is " + swap);
            } 
              
        }
        
        
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);
        printArr(arr);
;    }
    
}
