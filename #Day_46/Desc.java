public class Desc {


    public static void des(int n){
        //Base case
        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        des(n-1);
    }
    public static void main(String[] args) {
        
        des(5);
    }
}