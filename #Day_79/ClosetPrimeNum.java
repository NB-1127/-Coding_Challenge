// Details
// Write a function that takes input an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime-numbers, print both.
// Test cases for candidate
// "32": Closest prime number is "31", so print "31"
// "30": Closest prime numbers are "29" and “31”, so print both

import java.util.Scanner;

public class ClosetPrimeNum {

    public static boolean isPrime(int num){

        if (num < 1) {
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void closetPrimeNum(int num){

        int smallClose= num - 1;
        int largestClose= num + 1;

        while (!isPrime(smallClose)) {
            smallClose--;
        }

        while (!isPrime(largestClose)) {
        largestClose++;
        }

        if ((num - smallClose) == (largestClose - num)) {

            System.out.println("Closet Prime num smallest and largest is :" + smallClose + " and " + largestClose);
        }else if((num - smallClose) < (largestClose - num)) {

            System.out.println("Smallest closet Prime num is " + smallClose);

        }else{
            System.out.println("Largest Closet Prime Num is :" + largestClose);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Num");
        int n=sc.nextInt();
        closetPrimeNum(n);
    }
}
