public class Power2orN {

    public static boolean isPowerTwo(int n){
        return (n & (n-1))==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerTwo(16));
    }
    
}
