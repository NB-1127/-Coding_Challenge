import java.util.*;

class Tester3 {

	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);

		Calculator calculator = new Calculator();
		
		System.out.println("Enter a numer");
		calculator.num=sc.nextInt();
        
		
		int result= calculator.sumOfDigits();
		System.out.println(result);
	}
}
class Calculator {

int num;

public int sumOfDigits(){
    int sum=0;
        while (num > 0) {
            sum += num % 10; 
            num = num / 10; 
        }
    return sum;
}

}