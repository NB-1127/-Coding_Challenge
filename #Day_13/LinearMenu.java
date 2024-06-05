import java.util.Scanner;

public class LinearMenu {


    //Linear Search Time Complexity:= O(n)
    public static int findString(String menu[], String key){

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[]={"dosa","Chole bhature","samosa","pav Bhaji"};
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a menu");
        String key= sc.next();

        int index=findString(menu, key);
        if (index== -1) {
            System.out.println("Not found index");
            
        }else{
            System.out.println("found index: " + index);
        }
    }
    
}
