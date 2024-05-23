public class Prime {
    public static void main(String[] args) {
        int n=23;
        boolean isPrime=true;
        for(int i=2; i<=n-1; i++){
            if (n%i==0) {

                isPrime=false;
                System.out.println("it is not prime");
                break;
            }
        }
        System.out.println(isPrime);
    }
}
