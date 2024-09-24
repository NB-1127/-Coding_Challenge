import java.util.Scanner;

public class CoinsToss {

    public static void coinToss(int amt){

        int five= amt / 5; // 5 coins
        int reminder= amt % 5; // remainder

        while (reminder % 2 != 0 && five > 0) {
            five--;
            reminder +=5;
        }
        if (reminder % 2 == 0) {
            int twos= reminder / 2;
            System.out.println(five + " coins of 5s"+ " and " + twos + " coins of 2s");
        }

       
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int amt= sc.nextInt();

        coinToss(amt);
    }
    
}
