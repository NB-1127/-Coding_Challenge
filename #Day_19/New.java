import java.util.Scanner;

//First program
public class New {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter a Number : ");
       int n=sc.nextInt();
       int m;
       int sum=0;

       for (int i = 1; i <=10; i++) {

        m=n*i;
        
        sum+=m*m;
       }
       System.out.println("Sum is : " + sum);
    }
    
}
