public class Fibbo {
    
    public static int fibbo(int n){
        //Base case
        if (n == 0 || n == 1) {
            return n;

        }
        int f1= fibbo(n-1);
        int f2= fibbo(n-2);
        int fn= f1 + f2;
        return fn;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(fibbo(n));
    }
}
