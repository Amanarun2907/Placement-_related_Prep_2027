public class search_in_sorted_matrix {
public static boolean staircase_searching(int matrix[][],int target){
int row = 0;
int col = matrix[0].length-1;
while (row<matrix.length && col>=0){
    // Considering the top right corner element as my starting point here .
    if(matrix[row][col]==target){
        System.out.println("Element found at index "+row+" "+col);
        return true;
    }
    else if(matrix[row][col]>target){
        col--;
    }
    else{
        row++;
    }

}
System.out.println("Element not found");
return false;

}
    public static void main(String[] args) {
        int matrix[][]= {{1,3,5,7},
                         {10,11,16,20},
                         {23,30,34,60}};
    
    int key = 100;
 staircase_searching(matrix,key);
}
}
// Time Complexity: O(n+m)
// Space Complexity: O(1)
