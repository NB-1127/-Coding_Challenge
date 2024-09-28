// Details
// Write a function that takes input an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime-numbers, print both.
// Test cases for candidate
// "32": Closest prime number is "31", so print "31"
// "30": Closest prime numbers are "29" and “31”, so print both
// 10min
import java.util.Scanner;

public class ClosestPrimeNum {

    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }

       for (int i = 2; i <Math.sqrt(num); i++) {
        if (num % i ==0) {
            return false;
        }

       }
       return true;
    }

    public static void closetPrime(int num){
        int smallL= num-1;
        int largestL= num +1;

        while (!isPrime(smallL)) {
            smallL--;
        }

        while (!isPrime(largestL)) {
            largestL++;
        }

        if ((num - smallL) ==  (largestL - num)) {
            System.out.println("closet prime number is "+ smallL + " and "+ largestL);
        }else if((num - smallL) < (largestL - num)){
            System.out.println("Closet smallest Prime num is : " + smallL);
        }else{
            System.out.println("closet largest prime num is : "+ largestL);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();

        closetPrime(num);
    }
    
}
