public class Tarnspose {


    public static void helper(int arr[][]){

        int n=arr.length;
        int m=arr[0].length;

        int[][] tranpose=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                tranpose[i][j] = arr[j][i];
                
            }
            
        }
        
        System.out.println("transpose array:");
            for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                System.out.print(tranpose[i][j]+ " ");
                
            }
            System.out.println();
        
        }
    
    }
    // Method to print a matrix
    public static void printArr(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[][]={
            {1, 2, 3},
            {4, 5, 6},
        };
        
        helper(arr);
        printArr(arr);

        
    }
    
}
