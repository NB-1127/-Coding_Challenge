import java.util.Scanner;

public class ArrayBinarySearch {

    public static int binarySearch(int number[], int key){

        int start=0;
        int end= number.length-1;

        while ( start <= end) {

            int mid= (start+end)/2;

            if (number[mid]== key) {
                return mid;
            }else if (number[mid] > key ) { // left
                end= mid-1;
            }else{// right
                start=mid+1;
            }

            
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[]={2,34,5,6,7,8,10,11,23};
        int key = 11;

        System.out.println(binarySearch(number, key));

    }
    
}
