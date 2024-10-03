// Fibonacci Member
// Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
// Fibonacci Series is defined by the recurrence
// F(n) = F(n-1) + F(n-2)
import java.util.*;
public class FibboIsNot {

    public static int fibboseries(int n){
        if (n == 0 || n== 1) {
            return n;
        }
        int fnm1= fibboseries(n-1);
        int fnm2= fibboseries(n-2);

        int fn= fnm1 +fnm2;

        return fn;
    }


    // public static void fibbo(int n){
    //     int a=0; int b=1;
    //     boolean isSeries=false;
    //     while (a <= n) {
            
    //         int temp= a+b;
    //         a=b;
    //         b=temp;

            
    //         System.out.println(a);
    //     }

        
    // }
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fibboseries(n));
        // fibbo(n);
    }
}
