import java.util.Stack;

public class TrappinRainWStack {

    //Time complexcity iis : O(n)
    public static int trappingRainWater(int height[]){

        Stack<Integer> st=new Stack<>();
        int ans=0;

        for (int i = 0; i < height.length; i++) {
            
            while (st.isEmpty()==false && height[st.peek()]<height[i]) {
                int m =st.pop();
                if (st.isEmpty()==true) {
                    
                    break;
                }
                int l=st.peek();
                int h= Math.min(height[i], height[l] - height[m]);
                int w = i-l-1;
                ans += h*w;

            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(trappingRainWater(height));
    }
}