// Details
// Write a function that takes input an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime-numbers, print both.
// Test cases for candidate
// "32": Closest prime number is "31", so print "31"
// "30": Closest prime numbers are "29" and “31”, so print both

// 10 min
import java.util.*;
public class ClosetPrimeNum {

    public static boolean isPrime(int n){
        if (n <=1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i ==0) {
                return false;
            }
        }
        return true;
    }

    public static void findClosetPrime(int num){

        int smallest= num-1;
        int highest= num +1;

        while (!isPrime(smallest)) {
            smallest--;
        }

        while (!isPrime(highest)) {
            highest++;
        }


        if ((num- smallest) == (highest - num)) {
            System.out.println("Closest prime number is"+ smallest+ " and " + highest);
        }else if((num- smallest) < (highest- num)){
            System.out.println("Closest Smallest Prime number is :" + smallest);
        }else{
            System.out.println("Closest Highest Prime number is :" + highest);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        findClosetPrime(n);
    }
    
}
