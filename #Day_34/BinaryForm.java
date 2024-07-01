public class BinaryForm {

    public static void binaryNum(int n, int lastindx, String str){
        //base cas
        if (n==0) {
            System.out.println(str);
            return;
        }

        binaryNum(n-1, 0, str+"0");
        if (lastindx == 0) {
          
          binaryNum(n-1, 1, str+"1");
            
        }
    }
    public static void main(String[] args) {
        binaryNum(3, 0, "");
    }
    
}
