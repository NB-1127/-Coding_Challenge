
class Order{
    int orderId;
    String orderedFood;
    double totalPrice;
    String status;


    public Order(int orderId, String orderedFood, double totalPrice, String status) {
        this.orderId = orderId;
        this.orderedFood = orderedFood;
        this.totalPrice = totalPrice;
        this.status = status;
    }
    public double calculateTotalPrice(int unitPrice){
        double serviceCharge = 0.05; // 5% service charge
        totalPrice = unitPrice + (unitPrice * serviceCharge); // Calculate total price
        return totalPrice;
    }
}
public class Tester {
    public static void main(String[] args) {
        Order o= new Order(1, "pizza", 100, "ordered");

        double calculatePrice= o.calculateTotalPrice(200);


        System.out.println("Order ID: " + o.orderId);
        System.out.println("Ordered Food: " + o.orderedFood);
        System.out.println("Status: " + o.status);
        System.out.println("Total Price: " +calculatePrice);

    }
}
