import java.util.Scanner;

public class StringPalindrom {


    public static boolean findPlalindromString(String str){
        int n=str.length();
        for (int i = 0; i < str.length()/2; i++) {

            if (str.charAt(i)!= str.charAt(n-1-i)) { // i == n-1-i we can compair the string in start and end position 
               return false;
                
            }
            
        }
        return true;
    }

    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str= sc.next();

       System.out.println(findPlalindromString(str));
    }
}