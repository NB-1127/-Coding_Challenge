import java.util.*;



// Details
// Write a function that takes input an integer number and prints the closest prime integer to that number. The closest prime can be greater or smaller than the passed input integer. If there are equi-distant prime-numbers, print both.
// Test cases for candidate
// "32": Closest prime number is "31", so print "31"
// "30": Closest prime numbers are "29" and “31”, so print both

public class PrimeNo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count;
        
        // for (int i =2; i <=100; i++) {
        //     count=0;
        //     n=i;
        //     for (int j =1; j <=n; j++) {
        //         if (n % j == 0) {
        //             count++;
        //         }
        //     }
        //     if (count == 2) {
        //         System.out.println("prime number is:"+ i);
        //     }
        // }
        
        int n= sc.nextInt();


        for (int i = 1; i <100; i++) {
            count =0;
            if (n % i ==0) {
                count++;
            }
            
        }
        
    }
}

    

