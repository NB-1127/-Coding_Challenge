import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.*;
public class Example {
    public static void main(String[] args) throws IOException {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       int[] problem =new int[n];
       for(int i =0;i<n;i++)
      {
        problem[i]=sc.nextInt();
      } 
      Arrays.sort(problem);
      int contest=0;
      int size=0;
      for(int i =0;i<n;i++)
      {
        if(problem[i]>size){
            contest++;
            size++;
        }   
       } 

       System.out.println(contest);
    }
}