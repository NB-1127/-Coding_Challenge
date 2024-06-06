public class MaxSubSum {

    // time complexity is O(n^3)
        public static void sumMaxSubArray(int arr[]){
            int max_SubArray= Integer.MIN_VALUE;
            int prefix[]= new int[arr.length];

            prefix[0]= arr[0];

            for (int i = 1; i < prefix.length; i++) {
                prefix[i] = prefix[i - 1]+ arr[i];
            }
            for (int i = 0; i < arr.length; i++) {
                    int start=i;
                for (int j = i; j < arr.length; j++) {
                    int end=j;
                        int sum=0;
                    
    
                    sum= start ==0 ?  prefix[end] :prefix[end] - prefix[start-1];
                    
                   
                    if (max_SubArray < sum) {
                            
                        max_SubArray=sum;
                    }
                    
                    
                }
               
            }
            System.out.println(" Maximum numbers of sum of Subarray is: " + max_SubArray);
        }
        public static void main(String[] args) {
            
            int arr[]={1, -2, 6, -1, 3};
    
            sumMaxSubArray(arr);
        }
    }