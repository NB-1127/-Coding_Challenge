public class BinaryToDecimal {

    public static void binarytoDesc(int binum){
        int pow= 0;
        int decimal=0;
        int myNum= binum;
        
        
        while (binum > 0) {

          int lastD= binum % 10;

           decimal= decimal + (lastD * (int)Math.pow(2, pow)); 

           pow++;
           binum=binum/10;
        }
        System.out.println("To convert Binary to Decimal is "+ myNum  + " = " + decimal);

    }
    public static void decimalToBinary(int n){
        int pow=0;
        int binary=0;
        int mynum= n;

        while (n > 0) {
            int rem= n % 2;
            binary= binary + (rem * (int)Math.pow(10, pow));

            pow++;
            n= n/2;
        }
        System.out.println("Decimal to Binary " + mynum + " is =" + binary);
    }

    public static void factNum(int num){
        int fact=1; int sum=0;

        for (int i = 1; i <= num; i++) {
         fact =fact * i;  
        sum = sum + fact;
        }
        System.out.println(fact);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        binarytoDesc(101);
        decimalToBinary(7);
        factNum(5);
    }
    
}
