import java.util.Scanner;

public class PrimeNUMber {

    public static boolean isPrime(int n){

        if (n <= 1) {
            return false;            
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i ==0) {
                return false;
            }
        }
        return true;
    }
public static void findClosetPrimeNO(int num){

    int lowest= num-1;
    int highest= num+1;

    while (!isPrime(lowest)) {
        lowest--;
    }
    while (!isPrime(highest)) {
        highest++;
    }

    if ((num - lowest) == (highest- num)) {
        System.out.println("Closest Prime number is " + lowest + " and " + highest);
    }else if ((num- lowest) < (highest- num)){
        System.out.println("Lowest closest prime number is : "+lowest);
    }else {
        System.out.println("Highest closest prime number is : "+ highest);
    }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        System.out.println(isPrime(n));
        findClosetPrimeNO(n);
    }
    
}
