public class SumOfN {


    public static int sumOfN(int n){
        //Base Case
        if (n==1) {
            return 1;
        }
        int snm1= sumOfN(n-1);
        int sn=n + snm1;
        return sn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfN(n));
    }
    
}
