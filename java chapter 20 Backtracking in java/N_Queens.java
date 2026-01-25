public class N_Queens {
    // function of nqueens 
    // isSafe function 
    public static boolean isSafe(char board[][] , int row , int col){
        // There are 8 unsafe direction for the queen to be placed : vertically up , (*vertically down) , (*horizontal left) , (*horizontal right) , vertically up left , vertically up right , (*vertically down left), (*vertically  down right) 
         // vertical up 
         // column remains constant but row changes 
         for (int i  = row-1;i>=0;i--){  // decrement 
            if(board[i][col]=='Q'){
                return false;
            }
         }
         // diag left up 
         // row decreasing 
         // column decreasing 
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
         //apart from these 3 cases return true
           return true;
    }
    public static void nqueens(char board[][] , int row ){
        // int count = 0 ; 
        // base case of the nqueens problem 
        if(row == board.length){
            print(board);
            // count++;
            return ;
        }
        // recursion 
        // column loop 
        for (int  j= 0;j<board.length;j++){
            if(isSafe(board,row,j)==true){ // at that particular address of the cell is it safe to place a queen  
                board[row][j] = 'Q'; // assigning 
                nqueens(board, row+1); // recursion // no 2 queens are in same row 
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
    // static int count  = 0; // right 
    // int count  = 0; wrong  
    public static void main(String[] args) {
        // System.out.println("Problem statement : Place n queens on an N*N chessboard such that no  2 queens can attack each other ");
        int n= 4;
        char board[][] = new char [n][n]; // 2-d array 
        // initialize  the each element of 2-d array (board)  with 'X'
        for (int i = 0 ;i<n;i++){
            for (int j = 0;j<n;j++){
                board[i][j] = 'x'; // initialize 
            }
        }
        nqueens(board,0);
    //    System.out.println("total ways to solve n queens is = "+count); 
    }
}
 //  T.C = O(n!) 
 // Recurrence relation = 1 Queenplace * T(n-1)+ isSafe()

//Yes, arrays in Java are passed by reference, meaning that when an array is passed to a method, a reference to the original array is passed. This allows any changes made to the array within the method to be reflected in the original array.