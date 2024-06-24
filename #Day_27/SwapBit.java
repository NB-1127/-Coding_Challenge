public class SwapBit {

    //Swap two numbers without using any third variable
    public static void main(String[] args) {
        int a= 5;
        int b=3;

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a: " + a + " B: "+b); 
    }
    
}
