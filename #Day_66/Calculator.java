import java.util.*;
class Calculator {

	public double findAverage(int num1, int num2, int num3) {
        double average = (num1 + num2 + num3) / 3.0; 
        return Math.round(average * 100.0) / 100.0; 
    }
}

class Tester {

	public static void main(String args[]) {
	    Scanner sc= new Scanner(System.in);
		Calculator calculator = new Calculator();
		int num1 =sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        
        double average = calculator.findAverage(num1, num2, num3);
        
    
        System.out.println("The average is: " + average);
	}
}