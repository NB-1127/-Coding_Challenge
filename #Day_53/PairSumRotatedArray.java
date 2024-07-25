import java.util.ArrayList;

public class PairSumRotatedArray {

    //Time Complexity is O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target){

        int bp= -1;
        int n= list.size();
        for (int i = 0; i <list.size(); i++) {
            
            if (list.get(i) > list.get(i+1)) { //Braking Point
                bp = i;
                break;
            }
        }
        int lp=bp+1; // Smallest point
        int rp=bp; // Largest Point

        while (lp != rp) {
            //Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            //Case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp+1) % n;
            }else{
                // Case 3
                rp=(n+rp-1) % n;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;

        System.out.println(pairSum(list, target));

    }
    
}
