public class GoldStall implements Stall {
    private String stallName;
    private Integer cost;
    private String ownerName;
    private Integer numberOfTVSets;

    // Default Constructor
    public GoldStall() {}

    // Parameterized Constructor
    public GoldStall(String stallName, Integer cost, String ownerName, Integer numberOfTVSets) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.numberOfTVSets = numberOfTVSets;
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

    public Integer getNumberOfTVSets() {
        return numberOfTVSets;
    }

    public void setNumberOfTVSets(Integer numberOfTVSets) {
        this.numberOfTVSets = numberOfTVSets;
    }

    // Overriding display method
    @Override
    public void display() {
        System.out.println("Stall Name: " + stallName);
        System.out.println("Cost: " + cost + " Rs");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of TV sets: " + numberOfTVSets);
    }
}