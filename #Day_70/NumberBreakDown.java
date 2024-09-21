// Question#6. Number Breakdown

// Details 
// Write a function that prints out a breakdown of an integer into a sum of numbers that have just one non-zero digit which is at the first position.
// Test cases 
// Input: 12345, Output: Print 10000 + 2000 + 300 + 40 + 5
// Input: 43018, Output: Print 40000 + 3000 + 10 + 8

import java.util.Scanner;

public class NumberBreakDown {

    public static void numberBreakDown(int number)
{
    String numStr=Integer.toString(number);
    //The integer number is converted into a string (numStr). This allows for easy digit-by-digit processing.

    String result="";
    //It will hold the final result that will be printed.
    int length=  numStr.length();

    for (int i = 0; i < length; i++) {
        char currentChar=numStr.charAt(i);
        if (currentChar != '0') {
            //This checks if the current character is non-zero. If it's a zero, it is ignored, as zeros don't contribute to the breakdown.
            if (!result.isEmpty()) {
                result+= " + ";
            //If the result string is not empty, it appends " + " to separate components. This ensures correct formatting between the terms.
            }
            result += currentChar; //The current non-zero digit is appended to the result.
            
            int zeroCount= length - i - 1;
            //here we calculate how many zeros need to be appended based on its position.
            for (int j = 0; j < zeroCount; j++) {
                result += '0';

            //This inner loop appends the appropriate number of zeros after the digit to reflect its place value. 
            }
        }
    }
    System.out.println(result);
}
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();

        numberBreakDown(number);
       



    }
    
}
