import java.util.Scanner;

public class CalcAvg_Add_gst {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float pencil= sc.nextFloat();
        float pen =sc.nextFloat();
        float eraser= sc.nextFloat();
        float total= pencil+pen+eraser;

        System.out.println("Total cost of items :"+ total);

        //add-on 18% tax to the items in bill
        
        float newtotal= total + (0.18f * total);
        System.out.println("Bill with 18% tax: "+ newtotal);
    
    }
}
