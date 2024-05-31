public class OptimizeWay_Prime {
    
    // Optimize way n= Math.sqrt(n)*Math.sqrt(n)
    // id number is 6= 1*6, 2*3, 3*2 this we can calculate the 3*2 is 6 and also cal 2*3 is 6
    // to optimize this calculation we can use the math.sqrt function
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }
        for (int i =2; i <= Math.sqrt(n); i++) {
            if (n % i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }
}
