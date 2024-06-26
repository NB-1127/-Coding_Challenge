public class RecursionSumOfNNaturalnoi {

    public static int sumOfNNatural(int  n){
        //Base Case
        if (n == 1 ) {
            return 1;
        }
        int fnm1=sumOfNNatural(n-1);
        int fn= n + fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sumOfNNatural(n));
    }
    
}
