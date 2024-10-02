// Question#3: Non-repeating character

// Details 
// Write a function that takes a String input and prints the first non-repeating character inside the string. You can assume that the string has all lower-case characters.

// Test cases for interview
// Input: ‘amazom’ Output: z
// Input: ‘rara’ Output: <empty>

import java.util.Scanner;

public class NonReapeatingChar {

    public static char nonRepetingstr(String str){
        int chars= 256;

        int arr[]= new int[chars];
        

        for(int i=0; i<arr.length; i++){
            arr[i]=0;
        }
        for(int i=0; i<str.length(); i++){
            arr[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if (arr[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return ' ';

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();

        System.out.println(nonRepetingstr(str));
    }
    
}
