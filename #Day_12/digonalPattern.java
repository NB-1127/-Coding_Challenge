public class digonalPattern {

    public static void diagonalP(int n){

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j<=i; j++) {

                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        diagonalP(5);
    }
}