import java.util.*;
public class creation_of_a_2d_array {
  public static void main(String[] args) {
      int matrix [][] = new int [3] [3];
      // total no of cells = 9 so we can store 9 integer value 
      Scanner sc = new Scanner(System.in); 
      System.out.println ("enter the input in the 2-d array");
      for (int i = 0;i<matrix.length;i++)
      {
        for (int j = 0 ;j<matrix[0].length;j++)
        {
             matrix[i][j] = sc.nextInt();
         }
      }
      System.out.println();
      System.out.println ("Values  in the 2-d array");
      for (int i = 0;i<matrix.length;i++)
      {
        for (int j = 0 ;j<matrix[0].length;j++)
        {
            System.out.print(matrix[i][j]+" ");
         }
         System.out.println();
      }
  }  
}
