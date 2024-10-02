// Details
// Write a function that takes input an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime-numbers, print both.
// Test cases for candidate
// "32": Closest prime number is "31", so print "31"
// "30": Closest prime numbers are "29" and “31”, so print both

import java.util.Scanner;

public class ClosetPrimeNum {

    public static boolean isPrime(int num){
        if (num <=1) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void closetPrime(int num){
        
        int smallestP= num -1;
        int largestP= num + 1;

        while (!isPrime(smallestP)) {
            smallestP--;
        }

        while (!isPrime(largestP)) {
            largestP++;
        }

        if ((num - smallestP) == (largestP - num)) {
            System.out.println("closest Prime num of smallest and largest " + smallestP + " and " + largestP);
        }else if ((num - smallestP) < (largestP - num)) {
            System.out.println("closet smallest prime number is " + smallestP);
        }else{
            System.out.println("closest largest prime num is " + largestP);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        closetPrime(num);
    }
    
}
