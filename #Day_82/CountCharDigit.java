// Count characters
// Write a program to count and print the total number of characters (lowercase english alphabets only), digits (0 to 9)
// and white spaces (single space, tab i.e. '\t' and newline i.e. '\n') entered till '$'.
// That is, input will be a stream of characters and you need to consider all the characters which are entered till '$'.
// Print count of characters, count of digits and count of white spaces respectively (separated by space).

import java.util.Scanner;

public class CountCharDigit {

    public static void countFind(String str){

        int chr=0;
        int digitc=0;
        int sp=0;

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                chr++;
            }else if (ch >= '0' && ch <= '9') {
                digitc++;
            }else if (ch == ' ' || ch== '\t' || ch == '\n') {
                sp++;
            }
        }
        System.out.println("Count is " + "charscter is " + chr +  "digit count is " + digitc + "special sym is " + sp);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a char , special symbolse, digit");
        String str= sc.nextLine();

        countFind(str);
    }
    
}
