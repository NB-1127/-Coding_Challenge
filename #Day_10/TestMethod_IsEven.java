import java.util.Scanner;

public class TestMethod_IsEven {

    /*write a method named isEven that accept an int argument.the method should 
    return true if the argument is even , or false otherwise.Also write a program to test your
    method
     */
    public static boolean isEven(int n){
        
        if(n % 2 ==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int num;

         System.out.println("Enter a Number");
         num=sc.nextInt();

         if(isEven(num)){
            System.out.println("Number is Even");
         }else{
            System.out.println("Number is Odd");
         }
        
    }
    
}
