public class kadanesAlgo {

    // time complexity is : O(n)
    public static void kadanes(int numbers[] ){

        int current_sum=0;
        int max_sum= Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            current_sum+= numbers[i];

            
            if(current_sum < 0){
                current_sum=0;
            }
            max_sum= Math.max(current_sum, max_sum);
        }
        System.out.println("maximum value of sum of subArray: " + max_sum);

    }

    public static void main(String[] args) {
    
         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
         kadanes(numbers);


    }
    
}
