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
        
        for(int i=2; i<num-1; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void closestPrimeNum(int num){

        int smallerP= num -1;
        int largest= num + 1;

        while (!isPrime(smallerP)) {
            smallerP--;
        }
        while (!isPrime(largest)) {
            largest++;
        }

        if ((num - smallerP) == (largest - num)) {
            System.out.println("cloasest Prime Number is  " + smallerP + " and " + largest);
        }else if ((num - smallerP) < (largest - num)) {
            System.out.println("Smallest closest Prime Number is " + smallerP);
        }else{
            System.out.println("Largest ClosestPrime Number is " + largest);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        closestPrimeNum(num);
    }
}
