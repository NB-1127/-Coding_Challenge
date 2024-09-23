import java.util.*;
public class RevString {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String rev="";

        for(int i= str.length()-1; i>=0; i--){

            char ch=str.charAt(i);
            rev= rev+ch;

        }
        System.out.println("reverse the String is :" + rev);
        if (str.equals(rev)) {
            System.out.println("String is Palindrom");
        }else{
            System.out.println("String is Not Palindrom");
        }
    }
    
}
