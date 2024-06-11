import java.util.Scanner;

public class Count_Ele_mul {

    public static void main(String[] args) {
        
        
        
        int arr[][]=new int[4][3];
        int n=arr.length;
        int m=arr[0].length;
        
        Scanner sc = new Scanner(System.in);
        int count=0;
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < m; j++) {
                
                arr[i][j]=sc.nextInt();
                if (arr[i][j]==7) {
                    count++;
                }
                
            }
            System.out.println("count is : "+count);
            
        }
    }
    
}
