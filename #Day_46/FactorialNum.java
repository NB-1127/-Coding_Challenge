
public class FactorialNum {

    public static int factNum(int n){
        //Base Case
        if (n==0) {
            return 1;
            
        }
        int fnm1= factNum(n-1);
        int fn= n * fnm1;
        return fn;
    }
    public static void main(String[] args) {
        
        int n=6;
        System.out.print(factNum(n));
    }
     
}
