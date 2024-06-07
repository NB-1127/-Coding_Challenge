public class MaxSubSum {

    // time complexity is O(n^2)
        public static void sumMaxSubArray(int arr[]){
            int max_SubArray= Integer.MIN_VALUE;

            int prefix[]= new int[arr.length]; // this array is store the sum of subarray

            prefix[0]= arr[0];// at first position prefix of sum is 0

            for (int i = 1; i < prefix.length; i++) {

                prefix[i] = prefix[i - 1]+ arr[i]; // this formula to callculate the sum of subarray
                //prefix[0]=1
                // index 1= prefix[ 1- 1] + arr[-2] == prefix[0] + arr[-2]== 1-2 =-1
                //index 2= prefix[2- 1] +arr[6] == prefix[1] + arr[6] == -1+6 = 5
                //index 3= prefix[3- 1] +arr[-1] == prefix[2] + arr[-1] == 5-1 = 4
                //index 4= prefix[4- 1] +arr[3] == prefix[3] + arr[3] == 4 + 3 = 7
                // sum of prefix array is ={1,-1,5, 4,7}

            }
            for (int i = 0; i < arr.length; i++) {
                    int start=i;
                for (int j = i; j < arr.length; j++) {
                    int end=j;
                        int sum=0;
                    
    
                    sum= start ==0 ?  prefix[end] : prefix[end] - prefix[start-1];
                    
                   
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