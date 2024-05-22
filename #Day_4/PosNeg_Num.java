import java.util.Scanner;

// Write a prg to print the number is positive or negative
public class PosNeg_Num {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");
        int n= sc.nextInt();
        
        if (n > 0) {
            
            System.out.println("It is Positive number");
        }else{

            System.out.println("It is negative number");
        }
    }
}