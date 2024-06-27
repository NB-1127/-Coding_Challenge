public class Recursionpowx {


    public static int power(int x, int n){
        //Base Case
        if (n ==0) {
            return 1;
        }
        int nm1=power(x, n-1);
        int pw=x* nm1;
        return pw;

        // return x * power(x, n-1);
    }
    public static void main(String[] args) {

        System.out.println(power(2, 10));
        
    }
}