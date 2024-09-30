// – Fibonacci Series
// 0 1 1 2 3 5 8 13 21

// Condtions:

// If the n value there in the series print the n value

// Else – print sum of even number less than that n value in the series

// Input: 21 output: 21

// Input: 20 output: 10

import java.util.Scanner;

public class Fibbo {

    public static void findFibboNum(int n){
        int a=0;
        int b=1;
        int sumEven=0;
        boolean isInSeries= false;

        while (a <= n) {

            int next= a+b; // calculate the next series
            a=b;
            b= next;

            if (a==n) { // check the number is present in fibbo series up to given value 
                isInSeries=true;
                break;
            }
            
            //Sum od even number
            if (a % 2 ==0) {
                sumEven +=a;
            }

            
        }
        // check number is in series
        if (isInSeries) {
            System.out.println(n);
        }else{
            System.out.println(sumEven);
        }

    }

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();

       findFibboNum(n);

    }
    
}
