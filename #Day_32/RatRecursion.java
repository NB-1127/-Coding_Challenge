public class RatRecursion {

    public static void ratResursion(int x, int y,int mat[][], int n,String curr){

        if (x<0 || y<0 || x==n || y==n || mat[x][y]==0) {
            
            return;
        }
        if (x==n-1 && y==n-1) {

            System.out.println(curr);
        }
        mat[x][y]=0; //Block

        ratResursion(x+1, y, mat, n, curr+ 'D');
        ratResursion(x, y-1, mat, n, curr+ 'L');
        ratResursion(x, y+1, mat, n, curr+ 'R');
        ratResursion(x-1, y, mat, n, curr + 'U');

        mat[x][y]=1;//Unblock
    }
    public static void main(String[] args) {
        int n=4;

        int mat[][]=new int[n][n];

        mat[0][0]=1;
        mat[0][1]=0;
        mat[0][2]=0;
        mat[0][3]=0;
        mat[1][0]=1;
        mat[1][1]=0;
        mat[1][2]=0;
        mat[1][3]=1;
        mat[2][0]=0;
        mat[2][1]=1;
        mat[2][2]=1;
        mat[2][3]=0;
        mat[3][0]=1;
        mat[3][1]=1;
        mat[3][2]=1;
        mat[3][3]=1;
        

        ratResursion(0, 0, mat, n, "");
    }
    
}
