public class TrappingWater {


    public static int trappingRain(int height[]){
        int n=height.length;
         //left max boundry -array
         int left_max[]= new int[n];
         left_max[0]= height[0]; 
         for (int i = 1; i < height.length; i++) {
            
            //height[i]: shows current value
            //left_max[i-1]: shows privious value stored in array of left_max

            left_max[i]=Math.max(height[i], left_max[i-1]);
         }
         //right max boundry -array
         int right_max[]=new int[n];
         right_max[n-1]=height[n-1];

         for (int i =n-2; i >=0; i--) {

            right_max[i]=Math.max(height[i], right_max[i+1]);

            
         }
         //loop
         int trapping_water=0;
         for (int i = 0; i <n; i++) {

            //waterlevel= min(leftboundry, rightboundry)
            int waterlevel=Math.min(left_max[i], right_max[i]);

             //total taraping water : trapping_water= waterlevel -height
            trapping_water += waterlevel - height[i];
            
         }
         return trapping_water;

    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 3, 2, 5};

        int ans=trappingRain(height);

        System.out.println(ans);
    }
    
}
