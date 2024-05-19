import java.util.Scanner;

// write a program to print all prime numbers in range between a and b
public class PrimeIS_A_B {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a range is A and B");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int i,n,j,count;
		
		for(i=a; i<=b; i++) {
			count=0;
			n=i;
			for(j=1; j<=b; j++) {
				
				if(n%j==0) {
					count++;
				}
			}
					
				if(count==2) 
					System.out.println("Prime number is: "+ i);
				}
				
    }
}
