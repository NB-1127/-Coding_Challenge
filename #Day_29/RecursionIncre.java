import javax.swing.event.SwingPropertyChangeSupport;

public class RecursionIncre {

    public static void printIncre(int n){
        //Base Case
        if (n == 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        printIncre(n+1);
        System.out.println();
    }
    
    public static void printin(int n){
        //Base case
        if (n == 1) {
            System.out.print(n);
            return;
        }
        printin(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n=1;
        printIncre(n);
        int n1=10;
        printin(n1);
    }
}
