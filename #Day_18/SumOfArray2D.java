public class SumOfArray2D {


    public static void helper(int[][] arr){
int n=arr.length;
int sum=0;
        for (int i = 0; i < n; i++) { // this in optimal function
            sum+= arr[1][i]; // here we only want ot accest the row 1 index sum  is 4+5+6
            
        }
        System.out.println("Sum is: "+ sum);

    }

    // sum of in 2 nd row in 1st index
    public static void main(String[] args) {
        int arr[][]={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };
        helper(arr);
        // int sum=0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum+= arr[1][i];
            
        // }
        // System.out.println("Sum is: "+ sum);
    }
    
}
/*for (int i = 0; i < arr.length; i++) { // row
    for (int j = 0; j < arr.length; j++) { // col
        if(i==1){
        sum+=arr[i][j];
        }

    }
}*/ 