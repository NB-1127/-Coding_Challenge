// Question#1: Leap year
// Details 
// Write a function that returns true if a particular year is a leap year. A leap year is one that is divisible by 4. There is one additional condition: if the year is divisible by 100, then the year needs to be divisible by 400 to be considered a leap year. For example, 1900 is not a year leap but 2000 is a leap year.
// Test cases 
// 2000 - Leap Year
// 2004 - Leap Year
// 1999 - Not a Leap Year
// 1900 - Not a Leap Year

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int n){

        if (n % 4 !=0) {
            return false;

        }else if(n % 100 ==0 && n % 400 !=0){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=  sc.nextInt();
        
        if (isLeapYear(n)) {
            System.out.println("Leap year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}