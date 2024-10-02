// 1)find minimum angle between hour and minute hand.
// hour hand moves : 30 degree at per hour
// minute hand moves : 6 degree at per minute

// Hour hand position: Hour position: 30×hour+0.5×minutes
// Minute hand position: Minute position=6×minutesMinute position= 6×minutes

// Angle between hands =∣Hour Position−Minute Position∣

// Minimum Angle = min(Angle between hands, 360∘ − Angle between hands)
import java.util.Scanner;

public class AngleBtweenHrandMin {


    public static int angleHrandMi(int hour, int minute){

        if (hour >= 12) {
            hour -=12;
        }

        double hourhand= (30 * hour) +(0.5 * minute);
        double minutehand= 6 * minute;

        // angle between hour hand and minute hand
        double angle=Math.abs(hourhand - minutehand);

        //Calcute minimum angle
        return (int)Math.min(angle, 360-angle);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Hour");
        int hour=sc.nextInt();
        System.out.println("Enter a minute");
        int minute=sc.nextInt();
        System.out.println(angleHrandMi(hour, minute));
    }
}
