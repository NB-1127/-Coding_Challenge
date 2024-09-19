import java.util.Scanner;
public class NumberBreakD {

    public static void numberBreakDown(int number)
{
    String numStr=Integer.toString(number);
    

    String result="";

    int length=  numStr.length();

    for (int i = 0; i < length; i++) {
        char currentChar=numStr.charAt(i);
        if (currentChar != '0') {
            
            if (!result.isEmpty()) {
                result+= " + ";
        
            
            }
            
            result += currentChar; 
            int count= numStr.length()-i -1;
            for (int j = 0; j < count; j++) {
                result += '0';
                
            }
            
        }
    }
    System.out.println(result);
}
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();

        numberBreakDown(number);
       


    }
    
    
}

    

