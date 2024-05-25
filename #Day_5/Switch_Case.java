import java.util.Scanner;

public class Switch_Case {
    
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter a no ");
        int ch= sc.nextInt();
        
        switch (ch) {
            case 1,2,3,4,5:
                System.out.println("Thursday");
                break;
            case 6,7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
