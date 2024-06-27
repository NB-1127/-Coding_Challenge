public class RecursionOptimizePow {


    public static int optimizePowerFun(int a, int n){
        //Base Case
        if (n == 0) {
            return 1;
        }
        //if the power is even
        int halfpow= optimizePowerFun(a, n/2);
        int halfPowSq= halfpow * halfpow;

        //odd Pow
        if (n %2 != 0) {
            halfPowSq= a* halfPowSq;
            
        }
        return halfPowSq;

    }
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(optimizePowerFun(a, n));
    }
    
}
