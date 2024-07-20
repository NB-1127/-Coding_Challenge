public class Recursion {

    public static void incresingOrder(int n){
        //Base Case
        if (n==0) {
            return;
        }
        incresingOrder(n-1);
        System.out.println(n);
    }


    public static void decresingOrder(int n){
        //Base Case
        if (n==0) {
            return;
        }
        System.out.print(n+" ");
        decresingOrder(n-1);
    }

    public static void main(String[] args) {
        incresingOrder(10);
        decresingOrder(10);
    }
}