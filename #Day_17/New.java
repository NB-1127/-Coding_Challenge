import java.util.Scanner;

public class New {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int table;
        int sum=0;

        for (int i = 1; i <=10; i++) {

            table=n*i;
            System.out.println(table);
            sum=sum+table;
            
        }
        System.out.println("Sum of the table is: "+ sum);
    }
    
}
