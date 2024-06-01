import java.util.Scanner;

public class Plalindrom_fun {


    public static void isPalindrom(int n){
        int myNum=n;
        int last; int sum=0;
        while (n > 0) {
            last= n % 10;
            sum= sum * 10 + last;
            n= n/10;
        }
        if (sum == myNum) {
            System.out.println("Number is Palindrom");
        }else{
            System.out.println("Number is not Palindrom");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int num= sc.nextInt();

        isPalindrom(num);
    }
    
}
