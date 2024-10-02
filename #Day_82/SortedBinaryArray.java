// sort a binary array using one traversal and no extra space

import java.util.Arrays;

public class SortedBinaryArray {

    public static void sortBinaryArray(int[] binaryArray){

        int i=0;// pointer to iterate the loop

        for(int j=0; j<binaryArray.length; j++){
            if (binaryArray[j] == 0) {
                
                int temp=binaryArray[i];
                binaryArray[i]=binaryArray[j];
                binaryArray[j]= temp;

                i++;
            }
        }
    }
    
    public static void main(String[] args) {
          int[] binaryArray = {1, 0, 1, 1, 0, 0, 1, 0};
        
        sortBinaryArray(binaryArray);
        System.out.println("Sorted Binary Array: " + Arrays.toString(binaryArray));
    }

}
