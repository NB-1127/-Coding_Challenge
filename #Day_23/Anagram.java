import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a,b;
        System.out.println("Enter a string first");

        a=sc.next();
        System.out.println("Enter a second string :");
        b=sc.next();
        //extract the characters from string into array

        char ch1[]=a.toCharArray();
        char ch2[]=b.toCharArray();

        //sort character array
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //check if both arrays are equal

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("String are anagram");
            
        }else{
            System.out.println("String not Anagram");
        }

    }
    
}
