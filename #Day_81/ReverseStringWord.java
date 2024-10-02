// Reverse Words in a String
// You are given a string of length N.
//  You need to reverse the string word by word. 
//  There can be multiple spaces between two words and there 
//  can be leading or trailing spaces but in the output reversed 
//  string you need to put a single space between two words, and 
//  our reversed string should not contain leading or trailing 
//  spaces.
import java.util.Scanner;

public class ReverseStringWord {

    public static void removespandRev(String str){
        //Step-1 Remove extra spaces
        String result="";
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if (ch !=' ') {
                result +=ch;
            }else if (ch ==' ' && str.charAt(i+1) !=' ') {
                result +=ch;
            }
        }
        
        // Step 2: Convert result to a char array and reverse the entire string
        char[] arr = result.toCharArray();
        reverseArray(arr, 0, arr.length - 1);

        // Step 3: Reverse each word in the reversed string
        reverseWords(arr);

        // Convert the array back to a string and print
        System.out.println(new String(arr).trim());

        
    }
    // Function to reverse a section of an array from start to end
    public static void reverseArray(char[] arr, int start, int end) {
    while (start < end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}
     // Function to reverse each word in the reversed string
     public static void reverseWords(char[] arr) {
        int n = arr.length;
        int start = 0;

        for (int i = 0; i <= n; i++) {
            if (i == n || arr[i] == ' ') {
                reverseArray(arr, start, i - 1);
                start = i + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
       removespandRev(str);
       
    }
    
}
