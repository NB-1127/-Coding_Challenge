import java.util.ArrayList;

public class ArrayListReverse {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1); //o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
        //add
        //get() //O(1)
        //remove // O(n)
        //size()
        //contain
        System.out.println(list.size());
        //Ascending order
        for(int i=0; i< list.size(); i++){
            int ele=list.get(i);
            System.out.print(ele+ " ");
        }
        System.out.println();

        //Reverse Number //o(n)
        for(int i=list.size()-1; i >=0; i--){
            int rev= list.get(i);
            System.out.print(rev+ " ");
        }
        System.out.println();
    }
    
}
