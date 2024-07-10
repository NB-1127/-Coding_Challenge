import java.util.ArrayList;
import java.util.Scanner;

public class BeautifulArrayList {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> ans= new ArrayList<>();

        int n=sc.nextInt();

        int rem=n-1;
        ans.add(1);
        

        for (int i = 1; i < rem; i++) {
         
            ArrayList<Integer> temp=new ArrayList<>();

            for(int ele : ans){
                if (ele *2<=n) {
                    temp.add(2*ele);   
                }
            }
            for(int ele : ans){
                if (ele *2-1<=n) {
                    temp.add(2*ele-1);   
                }
            }
            ans=temp;
        }
        System.out.println(ans);
    }
}