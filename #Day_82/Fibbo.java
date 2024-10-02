// – Fibonacci Series
// 0 1 1 2 3 5 8 13 21

// Condtions:

// If the n value there in the series print the n value

// Else – print sum of even number less than that n value in the series

// Input: 21 output: 21

// Input: 20 output: 10
import java.util.Scanner;

public class Fibbo {

    public static void fibboNumEvenSum(int num){
        int a=0;
        int b=1;
        int evenSum=0;
        boolean isSeries= false;

        while (a <= num) {
            int next= a+b;
            a=b;
            b=next;

            if (a == num) {
                isSeries=true;
                break;
            }

            if (a % 2==0) {
                evenSum +=a;
            }
            // System.out.println(a);// if we want to print the fibbo series
        }
        if (isSeries) {
            System.out.println(num);
        }else{
            System.out.println(evenSum);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();

        fibboNumEvenSum(num);
    }
    
}
