import java.util.Scanner;

public class SumOfDigit {

    // write a java method to compute the sum of the digits in an integer
    
    public static int SumOfDigit(int num){
        int sum=0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num= num/10;  
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input an integer: ");
        
        int digits = sc.nextInt();
        System.out.println("The sum is " + SumOfDigit(digits) );
        
    }
    
}
