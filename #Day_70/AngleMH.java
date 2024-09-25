// 1)find minimum angle between hour and minute hand.
// hour hand moves : 30 degree at per hour
// minute hand moves : 6 degree at per minute

// Hour hand position: Hour position: 30×hour+0.5×minutes
// Minute hand position: Minute position=6×minutesMinute position= 6×minutes

// Angle between hands =∣Hour Position−Minute Position∣

// Minimum Angle = min(Angle between hands, 360∘ − Angle between hands)

public class AngleMH {

    public static int findtheanglemini(int hour,int minute){

        // convert the 24 hour in 12 haour because the after 12 hour clock is repeated itself
        if (hour >= 12) {
            hour -=12;
        }

        double hourhand= (30 * hour) + (0.5 * minute);
        double minutehand= 6 * minute;

        // angle between hour hand and minute hand
        double angle= Math.abs(hourhand - minutehand);

        // calculate the minimum angle in between haour hand and minute hand
        return (int)Math.min(angle, 360 - angle);
    }
    
    public static void main(String[] args) {
        int hour=9;
        int minute=15;

        System.out.println("Minimum angle between Hour hand and Minute hand id : " +findtheanglemini(hour, minute)+ " degree");

    }
}
