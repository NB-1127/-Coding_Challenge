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
    public static void butterPattern(int n){
        //outer loop
        for (int i = 1; i <=n; i++) {
            
        
        //stars
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
            
        }

        //spaces 2*(n-i)
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
            
        }
        //stars
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
            
        }
        System.out.println();
       
    }
    //second half
    for (int i = n; i>=1; i--) {
        //stars
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
            
        }

        //spaces 2*(n-i)
        for (int j = 1; j <=2*(n-i); j++) {
            System.out.print(" ");
            
        }
        //stars
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
            
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
     
        butterFly(4);
        butterPattern(4);
    }
}
