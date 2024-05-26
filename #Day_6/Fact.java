import java.util.Scanner;

public class Fact {
    
    //Write a program to find the factorialof any number entered by the user
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int fact=1;
        int n;
        System.out.println("Enter a Positive integer");
        n= sc.nextInt();

        for (int i = 1; i <=n; i++) {

            fact = fact * i;
        }
        System.out.println("Factorial is :" + fact);
        
    }
}
