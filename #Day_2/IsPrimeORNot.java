import java.util.Scanner;

public class IsPrimeORNot {

    // Write a Prg to calvculate the number is prime or not
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n= sc.nextInt();

        boolean isPrime= isPrime(n); // to declare the boolean function to check the condition is true or false
        if (isPrime) {
            System.out.println(n + " is prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }
    }
        public static boolean isPrime(int num){
        if(num < 2){
            return false;

        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i==0){
                return false;
            }

        }
        return true;
    }
    
}
