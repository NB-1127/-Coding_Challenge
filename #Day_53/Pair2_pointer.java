import java.util.ArrayList;



public class Pair2_pointer {

    public static boolean pairSum(ArrayList<Integer> list, int target){

        int lp=0;
        int rp=list.size()-1;

        while (lp != rp) {
            //case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;

            }

            //Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }else{
                //Case 3
                rp--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target=5;

        System.out.println(pairSum(list, target));
    }
    
}
