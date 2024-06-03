public class hollowRect {


    public static void hollowR(int n){
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j<=i; j++) {

                if(i==j || j==1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        hollowR(5);
    }
    
}
