public class PowerWithOptimize {

    //Time complexity is: o(n)
    public static int power(int x, int n){
        //Base Case
        if (n == 0) {
            return 1;
        }
        int pnm1= power(x, n-1);
        int pn= x * pnm1;
        return pn;
    }

    // with the Optimize approach 
    //Time Complexity is O(log n)
    public static int powerOp(int b, int p){
        //Base Case
        if (p ==0) {
            return 1;
        }
        int half=powerOp(b, p/2);

        int halfsqrs=half * half;

        // if it is power is ODD
        if (p % 2 !=0) {
            return b * halfsqrs;
        }
        return halfsqrs;


    }
    
    public static void main(String[] args) {
        int x=2;
        int n=10;
        System.out.println(power(x, n));

        int b=2;
        int p=5;
        System.out.println(powerOp(b, p));
    }
}
