public class WhileLoop_NumPy {
    


    public static void numPattern(int n){
        int totalNum_line=n;

        int stars=1;
        int spaces=n-1;

        int currentNum_lines=1;

        while (currentNum_lines<= totalNum_line) {
            // print spaces
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
                
            }
            //print stars
            for (int i = 1; i <=stars; i++) {
                System.out.print(i+" ");
                
            }

            //prepared for next line
            System.out.println();
            stars++;
            spaces--;
            currentNum_lines++;
            
        }
    }
    public static void numPattern_1(int n){
        int totalNum_line=n;

        int stars=1;
        int spaces=n-1;

        int currentNum_lines=1;

        while (currentNum_lines<= totalNum_line) {
            // print spaces
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
                
            }
            //print stars
            for (int i = 1; i <=stars; i++) {
                System.out.print(i);
                
            }

            //prepared for next line
            System.out.println();
            stars++;
            spaces--;
            currentNum_lines++;
            
        }
    }
    public static void numPattern_2(int n){
        int totalNum_line=n;

        int stars=1;
        int spaces=n-1;

        int currentNum_lines=1;

        while (currentNum_lines <= totalNum_line) {
            
            //print stars
            for (int i = 1; i <=stars; i++) {
                System.out.print(i);
                
            }
            // print spaces
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
                
            }

            //prepared for next line
            System.out.println();
            stars++;
            spaces--;
            currentNum_lines++;
            
        }
    }
    public static void pattern(int n){
        int totalNum_line=2*n-1;

        int stars=1;
        int spaces=n-1;

        int currentNum_lines=1;

        while (currentNum_lines<= totalNum_line) {

            //print space
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
                
            }
            //print stars
            int number_to_print=1;
            for (int i = 1; i <=stars; i++) {
                System.out.print(number_to_print +"");
                if (i<=stars/2) {
                    number_to_print++;
                }else{
                
                    number_to_print--;
                }
                
            }
            //prepare for next line
            System.out.println();
            if (currentNum_lines < n) {
                spaces--;
                stars=stars+2;
            }else{
            spaces++;
            stars= stars-2;
            }
            currentNum_lines++;
 
        }

    }
    public static void main(String[] args) {
        numPattern(5);
        numPattern_1(5);
        numPattern_2(5);

        pattern(5);
    }
}
