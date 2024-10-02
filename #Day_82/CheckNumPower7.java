// 1. Check if a Number is a Power of 7

import java.util.Scanner;

public class CheckNumPower7 {

    public static boolean isPowerOfSeven(int num){

        if (num <=0) {
            return false;
        }
        while (num % 7 ==0) {
            num = num/7;
        }

        return num == 1;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if (isPowerOfSeven(n)) {
            System.out.println(n + " is a power of 7.");
        }else{
            System.out.println(n + " is not a power of 7.");
        }
    }
    
}
