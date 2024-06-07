public class TrappingRain {

    
    public static int trappingWater(int height[]){
        int n=height.length;
        //left max baundary-array
        int left_max[]= new int[n];
        left_max[0]=height[0];
        for (int i = 1; i < height.length; i++) {
                
            //height[i]: shows current value
            //left_max[i-1]: shows privious value stored in array of left_max

            left_max[i]=Math.max(height[i], left_max[i-1]);
            
        }
        //right max boundary-arry
        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];
        for (int j =n-2; j >=0; j--) {

            right_max[j]=Math.max(height[j], right_max[j+1]);

        }
        //loop
        int trapwater=0;
        for (int i = 0; i < n; i++) {

            //waterlevel= min(leftboundry, rightboundry)
            int waterlevel=Math.min(left_max[i], right_max[i]);

             //total taraping water : trapping_water= waterlevel -height
            trapwater += waterlevel - height[i];

        }
        
       
        return trapwater;

    }
    public static void main(String[] args) {
       int height[]={0,1,0,2,1,0,1,3,2,1,2,1}; 

       System.out.println(trappingWater(height));
    }
}