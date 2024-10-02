// Longest substring pallandrome in a string

import java.util.Scanner;

public class LongestSubStringPalindrom {

    public static boolean isPalindrom(String str){
        int start=0;
        int end=str.length()-1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longestSubStringPalindrom(String str){
        if (str == null && str.length() < 1) {
            return "";
        }

        String longest="";

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                String subString=str.substring(i, j);

                while (isPalindrom(subString) && subString.length() > longest.length()) {
                    longest=subString;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();

        System.out.println(longestSubStringPalindrom(str));
    }
    
}
