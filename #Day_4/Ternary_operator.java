public class Ternary_operator {
    
    // print value of x and y
    public static void main(String[] args) {
        int a= 63; 
        int b= 36;
        boolean x = (a < b) ? true : false;

        System.out.println(x);

        int y= (a > b) ? a : b;

        System.out.println(y);
    }
}
