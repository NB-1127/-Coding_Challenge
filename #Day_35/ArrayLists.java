import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        int n=5;
        ArrayList<Integer> arr1= new ArrayList<>(n);

        ArrayList<Integer> arr2= new ArrayList<>();

        System.out.println("Array_1="+arr1);
        System.out.println("Array_2="+ arr2);

        for (int i = 1; i <=10; i++) {
            if (arr1.size() < n) {
                arr1.add(i);
            }
            
            arr2.add(i);
        }
        System.out.println("Array_1="+arr1);
        System.out.println("Array_2="+ arr2);
    }
}