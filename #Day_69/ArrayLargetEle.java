public class ArrayLargetEle {

    public static void largetEle(int arr[]){

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>= largest) {
                secondLargest= largest;
                largest= arr[i];
            }else if(secondLargest <= arr[i] || arr[i] != largest){
                secondLargest= arr[i];
            }
        }
        System.out.println("Larget number is: "+largest);
        System.out.println("SecondLarget number is: "+secondLargest);
    }

    public static void main(String[] args) {

        int arr[]={3,6,2,1,8};
        largetEle(arr);
    }
    
}
