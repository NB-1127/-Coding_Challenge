import java.util.Scanner;

public class LeapYear {

    public static void leapY(int num, int startY){
        int count=0;
        int year=startY+1;


        while (count < num) {
            if ((year != 100 && year %4 !=0)||(year % 4==0)) {
                System.out.println(year);
                count++;
            }
            year++;
        }
    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a  start Year");
        int startY=sc.nextInt();
        System.out.println("Enter a Num");
        int num= sc.nextInt();
        leapY(num, startY);
    }
    
}
