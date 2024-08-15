class Restaurant {
   
    String name;
    float rating;
    long contact;
    String address;
    
    

    public Restaurant(String name,float rating,long Contact,String address) {

    this.name = name;
    this.rating = rating;
    this.contact = Contact;
    this.address= address;

}
   
    public void displayRestaurantDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
        
    }
}
public class Tester1 {
    public static void main(String[] args) {
       
        Restaurant restaurant = new Restaurant("McDonald's",4.1f,9988676767L,"SH1109 caroline street, springfiled");


        restaurant.displayRestaurantDetails();
    }
}
