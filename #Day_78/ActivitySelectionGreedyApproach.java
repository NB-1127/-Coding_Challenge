import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionGreedyApproach {

    public static void main(String[] args) {
        int start[]={1 ,3 , 0, 5, 8, 5};
        int end[]={2, 4, 6, 7, 9, 9}; // already end is sorted form

        // if the end is not sorted that time
        int activities[][]= new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // bys using lamda function we can sort the matrix
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // int maxcount=0;
        // ArrayList<Integer> ans=new ArrayList<>();

        // maxcount=1;
        // ans.add(activities[0][0]); // add first 
        // int lastEnd= activities[0][2];
        // for(int i=1; i<end.length; i++){
        //     if (activities[i][1] >= lastEnd) {
        //         maxcount++;
        //         ans.add(activities[i][0]);
        //         lastEnd= activities[i][2];
        //     }
        // }
        // this is used that time we dont get the end is sorted the we sort like that 
        int maxcount=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxcount=1;
        ans.add(0); // add first 
        int lastEnd= end[0];
        for(int i=1; i<end.length; i++){
            if (start[i] >= lastEnd) {
                maxcount++;
                ans.add(i);
                lastEnd= end[i];
            }
        }
        System.out.println(maxcount);
        for(int i=0; i<ans.size(); i++){
            System.out.print("A"+ans.get(i)+ " ");
        }
        System.out.println();
    }
}