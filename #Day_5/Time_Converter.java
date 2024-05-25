import java.util.Scanner;

public class Time_Converter {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int day= sc.nextInt();
        int hour= sc.nextInt();
        int minute= sc.nextInt();
        hour +=5;
        minute +=30;
        // GMT --> IST
        if(minute >=60){
            hour++;
            minute -=60;
        }
        if (hour >= 24) {
            day++;
            hour -=24;
        }
        
        System.out.print("day " + day+ " hour: " + hour + " minute: "+ minute);
        
    }
}