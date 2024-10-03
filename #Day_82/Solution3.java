import java.util.*;
public class Solution3 {


    public static String findspace(String str, int space[]){

        StringBuilder result=new StringBuilder();
        
        int spIndx=0;

        for(int i=0; i<str.length(); i++){

            while (spIndx < space.length && i == space[spIndx]) {
                result.append(' ');
                spIndx++;
            }

            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a String");
        String str= sc.next();

        System.out.println("Enter a number of spaces");
        int numberSpaces= sc.nextInt();

        int space[]= new int[numberSpaces];
        System.out.println("Enter a Position where we insert the spaces");
        for(int i=0; i<space.length; i++){
            space[i]=sc.nextInt();
        }

        System.out.println(findspace(str, space));

    }
    
}
