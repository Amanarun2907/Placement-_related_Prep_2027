public class sudoku{
    public static boolean is_safe(int sudoku [][], int row , int col,int digit)
    {
        //column 
       for(int i =0;i<=8;i++)
       {
        if(sudoku[i][col]==digit){
            return false;
        }
       }
        // row 
        for (int j = 0;j<=8;j++)
        {
           if(sudoku[row][j]==digit){
            return false;
           } 
        }
        // grid 
        int sr =  (row/3)*3; 
        int sc =  (col/3)*3; 
        for(int i = sr;i<sr+3;i++){
            for (int j = sc ;j<sc+3;j++){
             if (sudoku[i][j]==digit)   {
                return false;
             }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][], int row , int col){
        // base case 
        if(row == 9)
        {
         return true;   
        }
        
        // resursion 
        int nextRow = row , nextCol = col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
           return sudokuSolver(sudoku,nextRow,nextCol);
        }
        for (int digit = 1;digit<=9;digit++){
            if(is_safe(sudoku, row,col,digit)){
               sudoku[row][col] = digit;
               if(sudokuSolver(sudoku,nextRow,nextCol)){ 
                //solution exists 
                return true;
               }
               sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
       for (int i = 0  ; i<9;i++){
        for (int j =0 ; j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
       } 
    }
    public static void main(String[] args) {
    // sudoku is already present in 2 d matrix 
       int sudoku[][]= {
        {0,0,8,0,0,0,0,0,0}
    ,   {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};  
       if(sudokuSolver(sudoku,0,0)) {
        System.out.println("Solution exists ");
        printSudoku(sudoku);
       } else{
        System.out.println("solution does not exists ");
       }
    }

}
// Sudoku is a popular logic-based number puzzle played on a 9×9 grid. The grid is divided into nine 3×3 smaller boxes, making a total of 81 squares. The goal is to fill the grid with numbers from 1 to 9 following three simple rules:
// Each row must contain the numbers 1 to 9 without repeating.
// Each column must also have the numbers 1 to 9 without repetition.
// Each 3×3 box must include the numbers 1 to 9 without any duplicates.