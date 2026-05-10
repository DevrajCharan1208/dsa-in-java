

public class BT04NQueenProblem{
    public static void nQueens(char[][] board, int row){
        if(row == board.length){
            printBoard(board);
            System.out.println("");
            count++;
            return;
        }

        for(int i = 0; i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i] = 'Q';
                nQueens(board, row+1);
                board[row][i]= '-';
            }
        }
    }

    public static void printBoard(char[][] board){
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    public static boolean isSafe(char[][] board, int row, int col){
        //vertically up
        for(int i = 0; i<row; i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //left diagonal
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right diagonal
        for(int i = row-1, j = col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    
    static int count = 0;
    public static void main(String[] args) {
        int n = 6;
        char[][] board = new char[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                board[i][j] = '-';
            }
        }
        nQueens(board,0);
        System.out.println("Total ways : " + count);
    }
}