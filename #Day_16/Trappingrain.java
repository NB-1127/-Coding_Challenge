public class Trappingrain {

    

    public static int trapWater(int height[]){

int n=height.length;

        int left_max[]=new int[height.length];
        left_max[0]=height[0];
        for (int i = 1; i < n; i++) {
            
            left_max[i]=Math.max(height[i], left_max[i-1]);
        }

        int right_max[]=new int[n];
        right_max[n-1]=height[n-1];

        for (int i = n-2; i >= 0; i--) {
            
            right_max[i]=Math.max(height[i], right_max[i+1]);

        }
        int trapping=0;
        for (int i = 0; i < n; i++) {

            int waterlevel=Math.min(left_max[i], right_max[i]);
            trapping=waterlevel-height[i];
        }
        return trapping;
    }
    public static void main(String[] args) {
     
        int height[]={0,1,0,2,1,0,1,0,1,3,2,1,2,1};
        int ans=trapWater(height);
        System.out.println(ans);
    }
}