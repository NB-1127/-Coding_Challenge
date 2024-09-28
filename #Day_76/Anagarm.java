// Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. 

// Examples:

//  “act” and “tac” are anagram of each other. 
// “except” and “expect”
// 5min
import java.util.*;
public class Anagarm {

    public static void anagram(String str1, String str2){

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            
            System.out.println("anagarm String");
        }else {
            System.out.println("Not Anagaram String");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.next();

        String str2=sc.next();

        anagram(str1, str2);
    }
    
}
