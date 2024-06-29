import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class TicketBooking {
    private String customerName;
    private Integer noOfTickets;
    private Double price;
    
    public TicketBooking() {}

    public TicketBooking(String customerName, Integer noOfTickets, Double price) {
        this.customerName = customerName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public Integer getNoOfTickets() {
        return noOfTickets;
    }
    
    public void setNoOfTickets(Integer noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-15s %-15s", customerName, noOfTickets, price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TicketBooking> bookings = new ArrayList<>();
        
        System.out.println("Enter number of bookings");
        int numberOfBookings = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < numberOfBookings; i++) {
            System.out.println("Enter customer name");
            String customerName = scanner.next();
            
            System.out.println("Enter number of tickets");
            int noOfTickets = scanner.nextInt();
            
            System.out.println("Enter the price");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            
            bookings.add(new TicketBooking(customerName, noOfTickets, price));
        }
        
        List<TicketBooking> sortedBookings = bookings.stream()
            .sorted((b1, b2) -> b1.getPrice().compareTo(b2.getPrice()))
            .collect(Collectors.toList());
        
        System.out.format("%-10s %-15s %-15s\n", "Customer", "No Of Tickets", "Price");
        sortedBookings.forEach(booking -> System.out.println(booking));
        
        scanner.close();
    }
}
