import java.util.Scanner;

public class Roman_to_Integer {
    public static int romanToInt(String s) {
        int total=0;
        int prevalue=0;

        // Loop through each character in the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = getValue(c);

            // If the current value is less than the previous value, subtract it from the total
            if (value < prevalue) {

                total -= value; //total= tatal-value
            } else {
                // Otherwise, add it to the total
                total += value; //total= tatal+value
            }
            prevalue = value; // to store prevalue which we are firstly calculated 
        }

        return total;
    }

    // Method to return the integer value of a Roman numeral character
    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0; // In case of invalid character
        }
    
    }
    public static void main(String[] args) {
        
        System.out.println("III: " + romanToInt("III")); // Output: 3
        System.out.println("IV: " + romanToInt("IV"));   // Output: 4
        System.out.println("IX: " + romanToInt("IX"));   // Output: 9
        System.out.println("LVIII: " + romanToInt("LVIII")); // Output: 58
        System.out.println("MCMXCIV: " + romanToInt("MCMXCIV")); // Output: 1994

                   

        }
    }
    


            