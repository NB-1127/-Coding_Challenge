public class OneSolNQB {

    public static void  printBoard(char board[][]){
        System.out.println("-----Ches Board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
        }
        System.out.println();
    }
    public static boolean isSafe(char board[][], int row, int col){
        //vertical up
        for (int i =row-1; i>=0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static boolean nQueen(char board[][], int row){
        //Base case
        if (row == board.length) {
            count++;
            return true;
            
        }
        for (int i = 0; i < board.length; i++) {
            if(isSafe(board, row, i)){
            board[row][i]= 'Q';
            if(nQueen(board, row+1)){// function call
                
            }

            board[row][i]='.';// backtraking
        }
    }
    }
    static int count=0;
    public static void main(String[] args) {
        int n=4;
         char board[][]= new char[n][n];

         for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                board[i][j]='.';
            }
         }
         nQueen(board, 0);
         System.out.println("Count of ways  N-Qeen-problem:"+ count);
    }
    
}

