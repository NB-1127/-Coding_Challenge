import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void stringIsAnagram(String str1, String str2){

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("String is anagram");
        }else{
            System.out.println("String is not Anagram");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        stringIsAnagram(str1, str2);
    }
    
}
