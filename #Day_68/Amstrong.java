import java.util.*;
public class Amstrong {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(); int d;
        int sum=0; int temp= n;
        while (n >0) {
            d=n %10;
            sum=sum+(d*d*d);
            n= n/10;
        }
        if (temp == sum) {
            System.out.println("Number is Amstrong");
        }else{
            System.out.println("Number is not Amstrong");
        }
    }
    
}
