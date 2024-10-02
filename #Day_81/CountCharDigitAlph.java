// Count characters
// Write a program to count and print the total number of characters (lowercase english alphabets only), digits (0 to 9)
// and white spaces (single space, tab i.e. '\t' and newline i.e. '\n') entered till '$'.
// That is, input will be a stream of characters and you need to consider all the characters which are entered till '$'.
// Print count of characters, count of digits and count of white spaces respectively (separated by space).

import java.util.Scanner;



public class CountCharDigitAlph {

    public static void countOfADS() {
        Scanner sc = new Scanner(System.in);
        int alphabets = 0;
        int digitCount = 0;
        int whiteSpaceCount = 0;

        // Read characters continuously until '$' is encountered
        while (sc.hasNext()) {
            char ch = sc.next().charAt(0);

            // Check if the current character is '$', if so, break the loop
            if (ch == '$') {
                break;
            }

            // Count lowercase alphabets
            if (ch >= 'a' && ch <= 'z') {
                alphabets++;
            }
            // Count digits
            else if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
            // Count white spaces (space, tab, and newline)
            else if (ch == ' ' || ch == '\t' || ch == '\n') {
                whiteSpaceCount++;
            }
        }

        // Print counts of alphabets, digits, and white spaces
        System.out.println(alphabets + " " + digitCount + " " + whiteSpaceCount);

        // Close the scanner
        sc.close();
    }

    public static void main(String[] args) {
        countOfADS();
    }
}
