import java.util.*;
public class ArrayListSwap {

    public static void swapListNum(ArrayList<Integer> list, int indx1, int indx2){

        int temp=list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=  new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(10);
        list.add(11);
        list.add(14);

        int idx1= 1;
        int idx=5;
        System.out.println(list);
        swapListNum(list, idx1, idx);
        System.out.println(list);
    }
    
}
