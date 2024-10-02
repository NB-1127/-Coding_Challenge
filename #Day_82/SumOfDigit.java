// Details 
// Write a function that takes input an integer number and returns the sum of digits of that number.

// Test cases for candidate
// Input = 12 Output: "3"
// Input = 1234 Output: "10"

// Test cases for interview
// Input = 12 Output: 3
// Input = 1234 Output: 10
// Input = 1 Output: 1
// Input = 10 Output: 1

// Follow-up question
// If the candidate is able to write the solution, ask a follow up question where the candidate has to keep adding the digits until a single digit.

import java.util.Scanner;

public class SumOfDigit {

    public static void sumOfDigit(int num){

        int sum=0;
        while (num > 0) {
            int last= num % 10;
            sum= sum+ last;
            num= num/10;           
        }
        System.out.println("Sum of Digit is " + sum);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        sumOfDigit(num);
    }
}
