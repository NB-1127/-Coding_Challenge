import java.util.ArrayList;
import java.util.Collections;

public class ArraysColleSort {

    public static void main(String[] args) {
        
        ArrayList<Integer> list= new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(3);
        list.add(5);

        System.out.println(list);
        Collections.sort(list); // ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        //Decending order
        System.out.println(list);
    }
}