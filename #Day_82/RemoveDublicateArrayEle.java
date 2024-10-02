// Remove duplicates from an array and return a new array without using a set

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDublicateArrayEle {

    public static int[] removeDuplicates(int arr[]){

        List<Integer> list= new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            boolean isDublicate=false;

            for(int j=0; j<list.size(); j++){
                if (list.get(j) == arr[i]) {
                    isDublicate =true;
                    break;
                }
            }
            if (!isDublicate) {
                list.add(arr[i]);
            }

        }
        int[] result= new int[list.size()];
            for(int i=0; i< list.size(); i++){
                result[i]= list.get(i);
            }
            return result;
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
}
