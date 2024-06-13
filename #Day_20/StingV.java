
//jshgdjh
import java.util.Scanner;

public class StingV {

    public static int findLowerCasAndVowels(String str){
     int s=str.length();
     int count=0;
     for (int i = 0; i < s; i++) {

        char ch=str.charAt(i);
        if(Character.isLowerCase(ch)){
        if (ch == 'a' || ch == 'e' || ch=='i' || ch== 'o' || ch== 'u') {
            
            count++;
        }
    }
      
        
     }
     return count;
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a Sting");
        String str= sc.next();

        int ans= findLowerCasAndVowels(str);
        System.out.println("lOwer case letters and vowel count is :" + ans);
    }
}