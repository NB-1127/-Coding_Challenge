import java.util.*;
public class MaximumLenChain {
    
    public static void main(String[] args) { // O(nlogn)
        int pairs[][]={{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        // Sort the array of second no
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int maxLen=1;
        int chainEnd=pairs[0][1];

        for(int i=1; i<pairs.length; i++){
            if (pairs[i][0] >= chainEnd) {
                maxLen++;
                chainEnd= pairs[i][1];
            }
        }
        System.out.println("Maximum no of Chain : " + maxLen);
    }
    
}
