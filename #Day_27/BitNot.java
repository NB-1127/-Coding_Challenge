public class BitNot {

    //Que: Add 1 to an integer using Bit Manipulation
    /*Solution: Theexpression-~xwilladd1toanintegerx.Weknowthattogetnegativeofanumber,invertitsbitsandadd1toit(Remembernegativenumbersarestoredin2’scomplement form), i.e.,
    -x = ~x + 1;
    -~x = x + 1 (by replacing x by ~x) */

    public static void main(String[] args) {
        int x=6;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x= -4;
        System.out.println(x + " + " + 1 + " is " + -~x);
        x=0;
        System.out.println(x + " + " + 1 + " is " + -~x);
    }
    
}
