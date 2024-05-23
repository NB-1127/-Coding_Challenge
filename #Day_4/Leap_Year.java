import java.util.Scanner;

// Write a prg to print Leap Year or not
public class Leap_Year {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int n= sc.nextInt();

        if(n % 4 !=0){

            System.out.println("Not a Leap Year");

        }else if(n % 100 == 0 && n%400!=0){

            System.out.println("Not Leap Year");
        }else{
            System.out.println("Leap Year");
        }
        // other way
        /*if(n % 4==0){
            sysout("no")
        }else if(n % 100 ==0){
                Sysout("yes")
            }else if(n % 400==0){
                    Sysout("no")
                }else{
                    Sysout("yes")
                }
            }
        } */
    }
    
}
