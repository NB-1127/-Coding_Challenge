// Reverse Words in a String
// You are given a string of length N.
//  You need to reverse the string word by word. 
//  There can be multiple spaces between two words and there 
//  can be leading or trailing spaces but in the output reversed 
//  string you need to put a single space between two words, and 
//  our reversed string should not contain leading or trailing 
//  spaces.

import java.util.Scanner;

public class ReversingString {

    public static void removeSpace(String str){

        String result="";
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);

            if (ch != ' ') {
                result +=ch;
            }else if (ch == ' ' && str.charAt(i+1) != ' ') {
                result +=ch;
            }
        }

            // step 2 String to converTo charcter array
            char[] cha=result.toCharArray();
            reverseArray(cha, 0, cha.length - 1);

            // step 3 reverseWord in array
            reverseWord(cha);


            // Convert the array back to a string and print
        System.out.println(new String(cha).trim());

        
       
    }
    public static void reverseArray(char[] cha, int start, int end){
        
        while (start < end) {
                char temp= cha[start];
                cha[start]=cha[end];
                cha[end]= temp;
                start++;
                end--;
            
        }  
    }
     // Function to reverse each word in the reversed string
     public static void reverseWord(char[] cha){
        int n=cha.length;
        int start=0;
        for(int i=0; i<= n; i++){
            if (i == n || cha[i] == ' ') {
                reverseArray(cha, start, i - 1);
                start=i + 1 ;
            }
        }
     }
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String");
        String str= sc.nextLine();
        removeSpace(str);
    }
}
