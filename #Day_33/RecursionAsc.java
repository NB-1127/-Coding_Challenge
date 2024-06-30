public class RecursionAsc {

    public static void ascenOrder(int n){
        //base case
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        ascenOrder(n+1);
        System.out.println();
    }
    public static void main(String[] args) {
        int n=1;
        ascenOrder(n);
    }
}