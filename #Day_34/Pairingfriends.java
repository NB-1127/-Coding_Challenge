public class Pairingfriends {

    public static int  friendsPairing(int n){
        //base case
        if (n == 1 || n==2) {
            
            return n;
            
        }
        //single
        int fnm1=friendsPairing(n-1);
        // pair 
        int fm2= friendsPairing(n-2);
        int pairways= (n-1)* fm2;
        
        //totalnumber of ways
        int totalways= fnm1 + pairways;

        return totalways;
    }
    public static void main(String[] args) {
        int n= 3;
        System.out.println(friendsPairing(n));
    }
}