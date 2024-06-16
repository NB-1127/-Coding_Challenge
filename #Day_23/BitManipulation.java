public class BitManipulation {


    public static void main(String[] args) {
        System.out.println(5 & 2);// and operator 101 + 010 = 0
        System.out.println(5 | 2);// Or opertor 101 | 010 = 111
        System.out.println(5 << 2); // left shift operator 101 << 010: 00_0101= 0101_00 = 20 //formula is a<< b: a* 2^b= 5 * 2^2
        System.out.println(5 >> 2); // right shift operator 101 >> 010: 0001_01= 00_0001 = 1 //formula is a>>b: a/2^b= 5/2^2=1
        System.out.println(~5); // negation/Compliments:= ~000101= 111010 and most list significant value is 1
        // take 1's complement of this negation number is 000101 and add 1 to get 2's complement is: 000101+1=000110=6
        // and this most list significant value is 1 it represent -ve so it will become -6
        System.out.println(~0);// same as the prious one and value is -1

    }
    
}
