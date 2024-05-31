public class Binary_to_Decimal {
    
    // 101=int reverse order 1*2^0 + 0*2^1 + 1*2^2 = 1*1 + 0 + 1*2 = 1 + 4= 5
    public static void bintoDeci(int binum){
        int myNum=binum;
        int pow=0;
        int decNum=0;
        while (binum > 0) {
            int lastdigit= binum % 10;
            decNum= decNum + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            binum=binum/10;
        }
        System.out.println("Decimal of "+ myNum +" = " + decNum );
    }
    public static void main(String[] args) {
        bintoDeci(1010);
    }

}
