// Given a string containing only lowercase alphabets, we have to compress it by removing any consecutive repeated characters.
// replace consecutive repeating characters with the character and repetition count
// for single occurrence of a character just use the character as-is

// Examples:
// INPUT: "bbbbb"
// OUTPUT: "b5"
// INPUT: "abc"
// OUTPUT: "abc"
// INPUT: "aabbbcadd"
// OUTPUT: "a2b3cad2"

import java.util.Scanner;

public class CompressStr {

    public static void compressionStr(String str){

       StringBuilder result=new StringBuilder();

        
        for(int i=0; i<str.length(); i++){
            int count=1;
            while (i <str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
                count++;
                i++;
            }
            result.append(str.charAt(i));
            if (count > 1) {
                result.append(count);
            }

        }
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        compressionStr(str);
    }
}
