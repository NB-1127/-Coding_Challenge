// Example 1:Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]
// Output:   6 
// Explanation:The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
// In this case, 6 units of rain water (blue section) are being trapped.
public class TrapppingWaterRain {

    public static int trappingwater(int height[]){

        int n= height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for (int i = 1; i < leftmax.length; i++) {
            leftmax[i]=Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for (int i = n-2; i>=0; i--) {
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        //Trapping rain waterlevel
        int trappingwater=0;
        for (int i = 0; i < height.length; i++) {
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trappingwater += waterlevel - height[i];
        }
        return trappingwater;
    }
    
    public static void main(String[] args) {
        int height[]={0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapping Rain Water is :"+trappingwater(height));

    }
}
