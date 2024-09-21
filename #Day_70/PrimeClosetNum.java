public class PrimeClosetNum {

    public static boolean isPrime(int n){
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findClosetNum(int num){

        int lowerPrime=num-1;
        int higherPrime=num+1;

        while (!isPrime(lowerPrime)) {
            lowerPrime--;
        }
        while (!isPrime(higherPrime)) {
            higherPrime++;
        }

        if ((num - lowerPrime) == (higherPrime - num)) {
            System.out.println("closet prime  number is "+ lowerPrime + " and " + higherPrime );
        }else if ((num - lowerPrime) < (higherPrime - num)) {
            System.out.println("lower closet prime number is :" + lowerPrime);
        }else{
            System.out.println("higher closet prime number is "+ higherPrime);
        }
    }

    public static void main(String[] args) {
        int n=30;
        findClosetNum(n);
    }
    
}
