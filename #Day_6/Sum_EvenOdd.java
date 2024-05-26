import java.util.Scanner;

public class Sum_EvenOdd {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        int n,ch;
        int evenNum=0;
        int oddNum=0;

        do {
            System.out.println("Enter a number");
            n=sc.nextInt();
            if (n % 2==0) {
                evenNum += n;
                
            }else{
                oddNum += n;
            }
            System.out.println("Do you want to continue? press 1 for yes or 0 for no");

            ch=sc.nextInt();

        } while (ch==1);
        System.out.println("Sum of even number " + evenNum);
        System.out.println("Sun of Odd number " + oddNum);

        
    }
}
