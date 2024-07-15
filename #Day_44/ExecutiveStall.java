public class ExecutiveStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer numberOfScreens;

    // Default Constructor
    public ExecutiveStall() {}

    // Parameterized Constructor
    public ExecutiveStall(String stallName, Integer cost, String ownerName, Integer numberOfScreens) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.numberOfScreens = numberOfScreens;
    }

    // Getters and Setters
    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Integer getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(Integer numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    // Overriding display method
    @Override
    public void display() {
        System.out.println("Stall Name: " + stallName);
        System.out.println("Cost: " + cost + " Rs");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of Screens: " + numberOfScreens);
    }
}