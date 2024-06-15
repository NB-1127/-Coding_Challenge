public class StringDublicatesNum {

        // leetcode question
        public static int singleNumber(int[] nums) {
            int result=0;
    
            for(int i=0; i< nums.length; i++){
                result = result ^ nums[i];
                // result ^= nums[i];
            }
    
            return result;
            
        }
        public static void main(String[] args) {
            int nums[]={2,2,1};

           int ans= singleNumber(nums);
           System.out.println(ans);
        }
    
    
}
