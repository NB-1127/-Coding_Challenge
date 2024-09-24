// Details:
// Given an amount, write a program such that the program should return a minimum number of coins as a tender exact exchange against the given amount. The change should be only in the form of coins of 2s and 5s. 

// Test cases for candidate

// Input: 30
// Output: 6 coins of 5s

// Input: 32
// Output: 6 coins of 5s and 1 coin of 2s

// Input: 33
// Output 5 coins of 5s and 4 coins of 2s
// 25 min
import java.util.*;
public class Coins {

    public static void calculationFun(int amt){

        int five= amt /5; // 5s coins
        int reminder= amt % 5;//reminder of amt

        while (reminder % 2 !=0 && five > 0) {
            five--;
            reminder += 5;
        }
        if (reminder % 2==0) {
            int twos=reminder/2;
            System.out.println(five + " coins of 5s" + " and " + twos + " coins of 2s ");
        }
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Amount:");
        int amt=sc.nextInt();

        calculationFun(amt);
        }
    
}
