public class Butterfly {
    

    public static void butterFly(int n){

        int totalNum_line=2*n -1;

        int stars=1;
        int spaces= 2*n -2;

        int currentNum_lines=1;

        while (currentNum_lines <= totalNum_line) {

            //print stars
            for (int i = 1; i <=stars; i++) {
                System.out.print("*");
                
            }
            //print spaces
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
                
            }
            //print stars
            for (int i = 1; i <=stars; i++) {
                System.out.print("*");
            }
            //prepare to next line
            System.out.println();
            if (currentNum_lines < n) {
                stars++;
                spaces=spaces - 2;
            }else{
                stars--;
                spaces=spaces + 2;
            }
            
            currentNum_lines++;
        }
    }
    public static void main(String[] args) {
     
        butterFly(4);
    }
}
