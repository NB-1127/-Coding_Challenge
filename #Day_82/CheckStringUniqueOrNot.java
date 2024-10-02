// check whether string is unique or not.
import java.util.Scanner;

public class CheckStringUniqueOrNot {


    public static boolean isUnique(String str){

        for(int i=0; i<str.length(); i++){
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {

                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();

        System.out.println(isUnique(str));

    }
    
}
