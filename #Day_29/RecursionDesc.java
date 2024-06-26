public class RecursionDesc{


    public static void printDesc(int n){
        //base case
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDesc(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printDesc(n);
    }
}