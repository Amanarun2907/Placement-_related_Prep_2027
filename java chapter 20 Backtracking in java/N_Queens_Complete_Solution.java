public class N_Queens_Complete_Solution{
// We have to solve the problem associated with n-Queens 
// Function to check wheather the position is safe or not ......
public static boolean isSafe(char board [][] , int row , int col ){
// we have to check for 
// vertically up 
// only check for the row (as only row is decreasing by one )
for(int i = row-1;i>=0;i--){
    if(board[i][col]=='Q'){
        return false ; // not suitable to place the queen here 
    }
}
// left diagonal
// row ----> row -1
// col ---> col-1 
for (int i = row-1 , j= col-1;i>=0 && j>=0;i--,j--){
    if(board[i][j]=='Q'){
        return false ;  // not suitable to place the queen here
    }
} 
// right diagonal 
// row ---> row-1
// col ---> col+1
for (int i = row-1,j= col+1;i>=0 && j<board.length;i-- ,j++){
    if(board[i][j]=='Q'){
        return false;  // not suitable to place the queen here
    }
}
return true; 
}
// Main function for the N-Queens
public static boolean n_queens(char board [][] , int row ){
    // recursion

    // base case
      if(row==board.length){
        count++;
         print(board);
        return true;
      }
    // kaam (recursion)
    // for columns 
    for(int j = 0 ;j<board.length;j++){
        if(isSafe(board, row,j)==true){
         // place the queen 
         board[row][j] = 'Q';
         // recursive call 
         if(n_queens(board, row+1)==true){
            return true;
         } // as place queens horizontally is not allowed 
         // backtraking 
         board[row][j] = 'X';
        }
       
    }
     return false;
}



// Print function 
public static void print(char board[][])
{
// for better visibility add "-----chess board-------"
System.out.println("--------------------chess board------------------");
// we have to print the element of the 2-d board array 
for(int i = 0 ;i<board.length;i++){
    for(int j = 0 ;j<board.length;j++){
        System.out.print(board[i][j]+" ");
    }
    System.out.println();
}
}


 public static int count = 0;
    public static void main(String[] args) {
        int n = 10;
        char board [][] = new char [n][n];
        for(int i = 0;i<board.length;i++){
            for(int j = 0 ;j<board.length;j++){
                board[i][j]='X';
            }
            System.out.println();
        }
        n_queens(board , 0);
        System.out.println("the possible solutions are: "+count);
    }
}