import java.util.Scanner;

public class Solution3 {

    
    public static String insertSpaces(String str, int[] spaces) {
        StringBuilder result = new StringBuilder(); 
        int spIndex = 0; 

        
        for (int i = 0; i < str.length(); i++) {
            
            if (spIndex < spaces.length && i == spaces[spIndex]) {
                result.append(' '); 
                spIndex++;
            }
            result.append(str.charAt(i)); 
        }

        return result.toString(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("Enter the number of spaces :");
        int numSpaces = sc.nextInt();

        int[] spaces = new int[numSpaces];
        System.out.println("Enter the positions to create space:");
        for (int i = 0; i < numSpaces; i++) {
            spaces[i] = sc.nextInt();
        }

        
        String result = insertSpaces(str, spaces);
        System.out.println("Result String:");
        System.out.println(result);
    }
}
