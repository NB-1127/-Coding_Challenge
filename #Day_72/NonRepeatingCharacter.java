// Question#3: Non-repeating character

// Details 
// Write a function that takes a String input and prints the first non-repeating character inside the string. You can assume that the string has all lower-case characters.

// Test cases for interview
// Input: ‘amazom’ Output: z
// Input: ‘rara’ Output: <empty>
//25 min
import java.util.*;
public class NonRepeatingCharacter {

    public static char nonReapeatingChar(String s){
        int chars= 256;
        int n= s.length();

        int arr[]= new int[chars];

        for (int i = 0; i < chars; i++) {
            arr[i] += 0;
        }
        for (int i = 0; i < n; i++) {
            arr[(s.charAt(i))]++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i)] == 1) {

                return s.charAt(i);
            }
        }
        return 'E';
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(nonReapeatingChar(str));
    }
    
}
