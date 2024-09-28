// Question#3: Non-repeating character

// Details 
// Write a function that takes a String input and prints the first non-repeating character inside the string. You can assume that the string has all lower-case characters.

// Test cases for interview
// Input: ‘amazom’ Output: z
// Input: ‘rara’ Output: <empty>

import java.util.Scanner;

public class NonReapatingChar {

    public static void nonReating(String str){
        
        int freq[]=new int[26];

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
           if (ch >= 'a' && ch <= 'z') {
            freq[ch - 'a']++;
           }
            
        }

        for (int i = 0; i < freq.length; i++) {

            if (freq[i] > 0) {
                
                System.out.println((char)(i + 'a') + ":" + freq[i]);
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();

        nonReating(str);
    }
    
}
