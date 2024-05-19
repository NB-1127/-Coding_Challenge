import java.util.Scanner;

public class AreaOFSquare {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Side :");
        int side= sc.nextInt();
        int area= side* side;
        System.out.println("Area of Square:"+ area);
    }
}
