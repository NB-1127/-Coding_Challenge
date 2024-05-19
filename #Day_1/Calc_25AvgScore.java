import java.util.Scanner;

public class Calc_25AvgScore {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double avg;
        int sum=0;
        System.out.println("Enter a 25 exams score :");
            
        for (int i = 0; i <=25; i++) {
            int s=sc.nextInt();
            sum = sum+s;
            
        }
        avg= sum/25;
        System.out.println("Average is:" + avg);
        
    }
}
