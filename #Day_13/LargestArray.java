import java.util.*;

public class LargestArray {

    public static int getLargest(int numbers[]){

        int largesNum=Integer.MIN_VALUE;// -infinity
        int smallest=Integer.MAX_VALUE; //+infinity

        for (int i = 0; i < numbers.length; i++) {
            if (largesNum < numbers[i]) {
                largesNum= numbers[i];
            }

            if (smallest > numbers[i]) {
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest number is "+ smallest);
        return largesNum ;
        
    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};

        System.out.println("largest number is " + getLargest(numbers));
    }
    
}
