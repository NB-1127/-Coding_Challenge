import java.util.Scanner;

public class NumberBD {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int sum=0; int d;

        while (num >0) {
            d= num % 10;
            sum= sum * 10;
            num= num/10;
        }
        System.out.println(sum);
    }
    
}
