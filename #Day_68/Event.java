import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Event {
    private String name;
    private String detail;
    private String type;
    private String ownerName;
    private double costPerDay;

    public Event(String name, String detail, String type, String ownerName, double costPerDay) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
    }

   
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDetail() {
        return detail;
    }


    public void setDetail(String detail) {
        this.detail = detail;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getOwnerName() {
        return ownerName;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public double getCostPerDay() {
        return costPerDay;
    }


    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }


    public long calculateTotalDays(String startDate, String endDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date start = sdf.parse(startDate);
        Date end = sdf.parse(endDate);
        long duration = end.getTime() - start.getTime();
        return TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS) + 1; // Inclusive of start and end dates
    }
}
