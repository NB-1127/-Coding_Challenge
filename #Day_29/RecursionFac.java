public class RecursionFac {

    // time complexity : O(n)
    // space complexity : O(1)
    public static int fact(int n){
        //base case 0!= 1
        if (n==0) {
            return 1;
        }
        int facnm1=fact(n-1);
        int factt=(n*facnm1);
        return factt;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    
}
