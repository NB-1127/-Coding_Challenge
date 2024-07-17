public class incre {


    public static void increO(int n){
        //Base Case
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        increO(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        increO(10);
    }
    
}
