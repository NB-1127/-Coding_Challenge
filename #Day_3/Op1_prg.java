public class Op1_prg {
    
    public static void main(String[] args) {
        int x, y, z;
        x = y = z =2;
        x+= y; // x= x+y 2+2=4
        y-= z; // y= x-y 2-2=0
        x /= (x+ y); // x= 4 / (4+0)= 4/4=1
        System.out.println(x +" "+ y+ " "+ z);
    }
}
