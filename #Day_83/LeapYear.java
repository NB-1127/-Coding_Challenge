import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int n){

        if (n % 4 !=0) {
            return false;
        }else if (n % 100 ==0 && n % 400 !=0) {
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if (isLeapYear(n)) {
            System.out.println("Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}