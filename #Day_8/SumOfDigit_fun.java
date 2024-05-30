import java.util.Scanner;

public class SumOfDigit_fun {

    //Write a progrm to calculate the Sum of Digit

    public static int SumOFDigit(int num){
        int sum=0;
        int rev;
        while (num> 0) {
            // retrive the last digit
            rev= num%10;

            // add this digit to sum
            sum=sum+rev;

            // delete last digit
            num=num/10;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();

        int ans= SumOFDigit(num);
        System.out.println("Sum of Digit is :" + ans);
    }
    
}
