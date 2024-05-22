import java.util.Scanner;

// Write a prg to print Leap Year or not
public class Leap_Year {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int n= sc.nextInt();

        if(n % 4 ==0){

            System.out.println("Not a Leap Year");

        }else{

            System.out.println("Leap Year");
        }
    }
    
}
