import java.util.Scanner;

public class Multi2 {

    
    public static void main(String[] args) {
        int n=4;
        int m=3;
        int nums[][]=new int[n][m];
        int arr[][]={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12},
        };
        
       
        
        // Scanner sc=new Scanner(System.in);
        // int n=nums.length; // number of row
        // int m=nums[0].length; // number of column

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               

                System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("print"+ i +" row");
        //     for (int j = 0; j < arr.length; j++) {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    }
}