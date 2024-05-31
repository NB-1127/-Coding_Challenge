public class Prime_Fun {
    

    // to check a number is prime or not by using the method/function
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }
        for (int i = 2; i <= n-1; i++) {
            if(n % i==0)
                return false;   
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));

        System.out.println(isPrime(10));

    }
}
