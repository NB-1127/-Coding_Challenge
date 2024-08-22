import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int num=0; int temp=num;
        while (n>0) {
            n= n% 10;
            num= num * 10+ n;
            n=n/10;
        }
        if (temp == num) {
            System.out.println("is Palindrom");
        }else{
        System.out.println("is not Palindrom");
        }
    }
}