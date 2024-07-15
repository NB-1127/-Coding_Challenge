public class PremiumStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer numberOfProjectors;

    // Default Constructor
    public PremiumStall() {}

    // Parameterized Constructor
    public PremiumStall(String stallName, Integer cost, String ownerName, Integer numberOfProjectors) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.numberOfProjectors = numberOfProjectors;
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

    public Integer getNumberOfProjectors() {
        return numberOfProjectors;
    }

    public void setNumberOfProjectors(Integer numberOfProjectors) {
        this.numberOfProjectors = numberOfProjectors;
    }

    // Overriding display method
    @Override
    public void display() {
        System.out.println("Stall Name: " + stallName);
        System.out.println("Cost: " + cost + " Rs");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of Projectors: " + numberOfProjectors);
    }
}