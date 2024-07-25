import java.util.ArrayList;

public class StoreTrainWater {

    //By using  2 pointer Approach
    public static int storeTrainWater(ArrayList<Integer> height){

        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;

        while (lp < rp) {
            int ht=Math.min(height.get(lp), height.get(rp)); // smallest height 
            int width= rp - lp; // distance between to pol
            int currentW= ht * width; // area of rectangle
            maxwater= Math.max(maxwater, currentW); // Maximum area of rectangle


            // Update Pointer
            if (height.get(lp) < height.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> height= new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);


        System.out.println(storeTrainWater(height));
    }
}