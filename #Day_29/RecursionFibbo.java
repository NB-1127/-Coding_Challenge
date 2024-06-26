public class RecursionFibbo {

    //time complexity O(2^n)
    //space complexity O(n)
    public static int fibb(int n){
        if (n==0 || n==1) {
            return n;
       
        }

        int fibnm1=fibb(n-1);
        int fibnm2=fibb(n-2);

        int fibbn=fibnm1+fibnm2;
        
        return fibbn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibb(n));
    }
    
}
