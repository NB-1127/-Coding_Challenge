import java.util.ArrayList;

public class WaterLevelHigh { //O(n^2)

    public static void maxWaterLevel(ArrayList<Integer> list){

        int maxwater=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                int height= Math.min(list.get(i), list.get(j));
                int width= j-i;
                int currlevel= height* width;
                maxwater=Math.max(maxwater, currlevel);
            }
        }
        System.out.println(maxwater);
    }

    //2 pointer approach // O(n)
    public static int maxwaterlevel(ArrayList<Integer> list){

        int maxwater=0;
        int lp=0;
        int rp=list.size()-1;

        while (lp < rp) {
            
            int ht=Math.min(list.get(lp), list.get(rp));
            int width= rp - lp;
            int currwater= ht * width;
            maxwater= Math.max(maxwater, currwater);


            if (list.get(lp) < list.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        maxWaterLevel(list);
        System.out.println(maxwaterlevel(list));

    }
    
}
