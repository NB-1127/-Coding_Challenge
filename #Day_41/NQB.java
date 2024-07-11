public class NQB {

    public static void printBoard(char board[][]){
        System.out.println("--------Ches Board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][], int row, int col){
    
        //Vertical up
        for (int i =row-1; i >=0; i--) { // q is placed at center to check up direction if the any q is placed or not
            if (board[i][col] == 'Q') { // row-1
                return false;
            }
        }
        //digonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){ // row-1, col-1
            if (board[i][j]== 'Q') {
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){// row-1, col+1
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static void nQboard(char board[][], int row){
        //Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
       //Column loop
       for (int i = 0; i < board.length; i++) {
        if(isSafe(board , row, i)){
            board[row][i]= 'Q';// place queen
            nQboard(board, row+1);// function call
            board[row][i]='.'; // Backtraking
       }
    }

    }

    public static void main(String[] args) {
        int n=4;

        char board[][]= new char[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                board[i][j]='.';
            }
            
        }
        nQboard(board, 0);
    }
}