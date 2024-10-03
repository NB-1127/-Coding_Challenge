import java.util.Scanner;

public class NumBreakingDown {


    public static void breakdown(int n){

        StringBuilder result= new StringBuilder();
        String numStr=Integer.toString(n);

        int length= numStr.length();

        for(int i=0; i<numStr.length(); i++){
            char ch=numStr.charAt(i);
            if (ch != '0') {
                if (!result.isEmpty()) {
                    result.append('+');
                }

                result.append(ch);

                int counter= length-1-i;
                for(int j=0; j<counter; j++){
                    result.append('0');
                }
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        breakdown(n);
    }
    
}
