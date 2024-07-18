import java.util.ArrayList;

public class MaxNumArrayL {


    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(4);
        list.add(3);
        list.add(8);
        list.add(1);

        System.out.println(list);

        int max=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max=Math.max(max, list.get(i));
        }
        System.out.println("Maximum elemnt is = "+ max);
    }
    
}
