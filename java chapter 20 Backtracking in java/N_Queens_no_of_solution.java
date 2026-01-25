public class N_Queens_no_of_solution {
    // function of nqueens 
    // n queens : No 2 queens are in same row , same column ,same diagonal (this is the only condition)
    // isSafe function 
    public static boolean isSafe(char board[][] , int row , int col){
        // return type is boolean 
        // given is a chess board char board [][]
         // vertical up 
         for (int i  = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
         }
         // diag left up 
         for (int i = row-1,j = col-1;i>=0 && j>=0;i--,j--)
         {
                if(board[i][j] == 'Q'){
                    return false;
                }
         }
         // diag right up 
         // row decreasing 
         // col increasing 
         for (int i = row-1, j = col+1;i>=0 && j<board.length ;i--,j++)
         {
                if(board[i][j] == 'Q'){
                    return false;
                }
         }
           return true;
    }
    public static void nqueens(char board[][] , int row ){
        // int count = 0 ; 
        // base case
        if(row == board.length){
            // print(board);
            count++;
            return ;
        }
        // recursion 
        // column loop 
        for (int  j= 0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q'; // assigning 
                nqueens(board, row+1); // recursion 
                board[row][j] = 'x' ; // backtracking   
            }
            // board[row][j] = 'Q'; // assigning 
            // nqueens(board, row+1); // recursion 
            // board[row][j] = 'x' ; // backtracking   
        }
    }
    // Printing function 
    public static void print(char board[][]){
        System.out.println("---------chess board----------");
        for(int i= 0;i<board.length;i++){
            for(int j = 0 ;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
  
    }
    static int count  = 0; // right 
    // int count  = 0; wrong  
    public static void main(String[] args) {
        // System.out.println("Problem statement : Place n queens on an N*N chessboard such that no  2 queens can attack each other ");
        int n= 4; // answer is 2 
        char board[][] = new char [n][n]; // 2-d array 
        // initialize  the each element of 2-d array (board)  with 'X'
        for (int i = 0 ;i<n;i++){
            for (int j = 0;j<n;j++){
                board[i][j] = 'x'; // initialize 
            }
        }
        nqueens(board,0);
       System.out.println("total ways to solve n queens is = "+count); 
    }
}
 //  T.C = O(n!) 
 // Recurrence relation = 1 Queenplace * T(n-1)+ isSafe()
