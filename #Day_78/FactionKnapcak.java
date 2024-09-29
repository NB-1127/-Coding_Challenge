import java.util.Arrays;
import java.util.Comparator;

public class FactionKnapcak {


    public static void main(String[] args) {
        int val[]={60, 100, 120};
        int weight[]={10, 20, 30};
        int w=50;

        // tech ration sort by asending order
        double ratio[][]= new double[val.length][2];
        // 1st col for indx and 2nd col is ratio
        
        for(int i=0; i<val.length; i++){
            ratio[i][0]= i;
            ratio[i][1]=val[i]/ (double)weight[i];
            
        }
        // sort the rario
        Arrays.sort(ratio,  Comparator.comparingDouble(o -> o[1]));

        int capacity= w; // capacity is equal to weight
        int finalVal=0;
        for(int i=ratio.length-1; i>=0; i--){ // decending order to  take ratio
            int indx=(int)ratio[i][0];
            if (capacity >= weight[indx]) {
                finalVal += val[indx];
                capacity -= weight[indx];

            }else{

                finalVal += (ratio[i][1] * capacity);
                capacity=0;
                break;
            }

        }

        System.out.println("The Final value is : "+finalVal);


    }
    
}
