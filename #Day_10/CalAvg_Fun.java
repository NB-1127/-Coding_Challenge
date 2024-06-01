import java.util.Scanner;

public class CalAvg_Fun {

    //write Java method to compute the average of three numbers
    public static double averageThree(double a, double b, double c){

        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a first number:");
        double a= sc.nextDouble();

        System.out.println("Enter a second number: ");
        double b= sc.nextDouble();

        System.out.println("Enter a third number: ");
        double c= sc.nextDouble();

        double ans=averageThree(a, b, c);
        System.out.println("Average is : " + ans);

    }
}