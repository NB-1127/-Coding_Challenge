public class TrappingRainWater {

    // Time Complexity of this question is O(n)
    public static int trappWater(int height[]){
        int n=height.length;
        // left max bounary- array
        int left_max[]= new int[height.length];
        left_max[0]=height[0];
        for (int i = 1; i < n; i++) {

            left_max[i]=Math.max(height[i], left_max[i-1]);
        }
        //right max boundary - array
        int right_max[]=new int[height.length];
        right_max[n-1]=height[n-1];
        for (int i =n-2; i >=0 ; i--) {
            
            right_max[i]=Math.max(height[i], right_max[i+1]);
        }
        //loop
        int trappingWater=0;
        for (int i =0; i <n; i++) {

            // waterlevel of trapping rain water 
            int waterlevel= Math.min(left_max[i], right_max[i]);

            // Total Trapping water is trappingw= waterlevel - height;
            trappingWater += waterlevel -height[i];
            
        }
        return trappingWater;

    }
    public static void main(String[] args) {
        
        int height[]={4,2,0,6,3,2,5};
      
        int ans=trappWater(height);
        System.out.println("total trapping water is: " + ans);
    }
    
}
