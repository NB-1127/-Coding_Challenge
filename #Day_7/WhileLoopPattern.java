public class WhileLoopPattern {
    
    public static void printPattern(int n){
        int totalNumberof_lines=n;
        int spaces=n-1;
        int stars=1;

        
        int currentNum_lines= 1;

        while (currentNum_lines <= totalNumberof_lines) {

            //print spaces
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
            }

            //print stars
            for (int i = 1; i<=stars; i++) {
                System.out.print("*");
            }

            //prepare for next line
            System.out.println();
            currentNum_lines++;
            spaces--;
            stars++;
            
        }
        
    }

    public static void printPattern_1(int n){
        int totalNumberof_lines=n;

        int spaces=n-1;
        int stars=1;

        int currentNum_lines=1;

        while (currentNum_lines <= totalNumberof_lines) {
            
            //print stars
            for (int i = 1; i<=stars; i++) {
                System.out.print("*");
            }
            //print spaces
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
            }
            //prepare for next line
            System.out.println();
           
            spaces--;
            stars++;
           
            currentNum_lines++;
        }


    }
    
    public static void main(String[] args) {
      
        printPattern(6);
        printPattern_1(6);

            
    }
}

