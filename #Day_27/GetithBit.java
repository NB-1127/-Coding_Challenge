public class GetithBit {

    public static int getIthBit(int n, int i){// n= 10, i=1
        int bitmask= 1<<i;// no is 10=1010 and 1<<i= 0100 
        if((n & bitmask)==0){// 1010 & 0100 == 0
            return 0;
        }else{                 // 1010 & 0100 == 1
            return 1;
        }

    }
    public static int setIthBit(int n, int i){ // n= 10 , i=2
        int bitmask= 1<<i; // 1010= 1<<i = 0100
        return n | bitmask; // 1010 | (or) 0100
    }
    public static int claerIthBit(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    
    public static int updateIthBit(int n,int i, int newBit){
        // if (newBit == 0) {
        //     return claerIthBit(n, i);
        // }else{
        //     return setIthBit(n, i);

        // }

        n=claerIthBit(n, i);
        int bitmask= newBit<<i;
        return n | bitmask;


    }
    public static int clearLastBit(int n, int i){
        int bitmask= (~0)<<i;
       return n & bitmask;
    }
    public static int clearRangeBith(int n , int i, int j){
        int a= ((~0)<<(j+1));
        int b= (1<<i)-1;
        int bitmask= a | b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 1));

        System.out.println(setIthBit(10, 2));
        System.out.println(claerIthBit(10, 1));

        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastBit(15, 2));
        System.out.println(clearRangeBith(10, 2, 4));
    }
}