public class Fuction_ISEvenOROdd {

    //write a method isEven that accepts an int argument,
    //the method should return is even, or false
    public static boolean isEven(int num){
        if (num % 2== 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean ans= isEven(45);

        System.out.println(ans);
    }
}