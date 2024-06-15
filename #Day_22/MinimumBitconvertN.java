public class MinimumBitconvertN {

    // leetcode question 2220. Minimum Bit Flips to Convert Number
        public static int minBitFlips(int start, int goal) {
            
            int n= start ^ goal;
    
            int setBits=0;
            while(n != 0){
                n= n & (n-1);
                setBits++;
    
            }
            return setBits;
        }
    public static void main(String[] args) {
        
        
        

        int ans=minBitFlips(10, 7);
        System.out.println(ans);
    }
    
    
}
