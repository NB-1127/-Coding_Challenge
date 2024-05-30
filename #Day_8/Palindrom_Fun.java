public class Palindrom_Fun {
    
    /*Write a program to check if a number is Palindrom in java?
     */
    public static int PalindromDemo(int num){
        int sum=0;
        int rev; int temp=num;

        while (num>0) {
            
            rev=num % 10;
            sum=sum*10 + rev;
            num=num/10;    
        }
        return sum;
    }
    public static boolean CheckisPalindrom(int num){
            int reverseNumber= PalindromDemo(num);
            if (reverseNumber==num) {
                return true;
            }else{
                return false;
            }
    }
    public static void main(String[] args) {
        
        boolean ans=CheckisPalindrom(121);
        System.out.println(ans);
    }
}
