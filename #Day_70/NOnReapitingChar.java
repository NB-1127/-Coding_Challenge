import java.util.Scanner;

public class NOnReapitingChar {


    static char nonReptitingChar(String s){

        int chars= 256;
        int n=s.length();

        int arr[]=  new int[chars];

        for (int i = 0; i < chars; i++) {
            arr[i]=0; // 
        }
        
        for (int i = 0; i < n; i++) {
            arr[(s.charAt(i))]++;
        }
        for (int i = 0; i < n; i++) {
            
            if (arr[s.charAt(i)]== 1) {

                return s.charAt(i);
            }

            
        }
        return ' ';
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        System.out.println(nonReptitingChar(s));
        
    }
}
