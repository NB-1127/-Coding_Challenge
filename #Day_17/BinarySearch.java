public class BinarySearch {


    /*this question is based on the Rotated sort array
      it means the A rotated sorted array is an array that was initially 
      sorted but then rotated (shifted ) at certain pivot point
      some steps rotated sorted array
      step 1:
      the pivot is the point where the array is roatated
      this can be find by using modified binary search
      
      Step2:
      use the pivot to divide the array into two subarray
      this two subarray is indivisually sortated but need to be merged

      Step 3:
      merge two sorted sub array into one sorted array
     * 
     * 
    */


    //smallest element index
    public static  int minSearch(int nums[]){
        int start=0;
        int end= nums.length-1;

        while (start < end) {

            int mid= start + (end- start)/2;
            if(mid > 0 && nums[mid-1] >nums[mid]){
                return mid;

            }else if(nums[start] <= nums[mid] && nums[mid] > nums[end] ){
                    // this sorted for right half
                start= mid+1;


            }else{ //(nums[start] >= nums[mid] && nums[mid] < nums[end])


                // this sorted or left half
                end = mid-1;
            }

            
        }
        return start;

    }
    public static int search(int nums[], int target){

        int min=minSearch(nums);

        if(nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums,min, nums.length-1, target);
        }// this fuction mid +1 to end
        else{
            return search(nums,0, min-1, target);
            // this function goes to 0 to min-1
        }
    }
    public static int search(int nums[], int s, int e, int target){
        
        while (s<= e) {
            int mid=s+(e-s)/2;
            if (nums[mid]==target) {
                return mid;

            }else if(nums[mid] > target){
                // left half

                e=mid-1;
            }else{
                // righ half
                s= mid +1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        
        // int nums[]={4,5,6,7,0,1,2};
        // int nums[]={1};
        int nums[]={4,5,6,7,0,1,2};
        int target=3;
        System.err.println();
        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }

        
    }
    
}
