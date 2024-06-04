import java.util.Scanner;

public class ArraysCC{

    public static void main(String[] args) {
        

        int marks[]= new int[5];

        Scanner sc= new Scanner(System.in);

        //marks of hindi marathi englis

        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("hindi " + marks[0]);
        System.out.println("marathi " + marks[1]);
        System.out.println("English " + marks[2]);


    }
}