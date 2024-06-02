public class FloydTri {


    public static void pattern(int n){
        int ch=1;
        for (int i = 1; i <=n; i++) {

            for (int j =1; j <=i; j++) {
                
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
    
}
