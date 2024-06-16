public class OddEvenBit {


    public static void oddEven(int n){

        if ((n & 1) == 0) {
            System.out.println("Even Number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        
        oddEven(3);
        oddEven(11);
        oddEven(27);
        oddEven(2);
    }

}