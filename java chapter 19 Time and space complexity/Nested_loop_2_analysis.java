public class Nested_loop_2_analysis {
   public static void main(String[] args) {
    int n= 10;
      for (int i = 0;i<n;i++){ // i is moving from 0 to n-1
        for ( int j = 0;j<i;j++){ // j is moving from 0  to i-1
            System.out.println("("+i+","+j+")");
            // some constant work 
            // is done in this loop 
        }
      } 
   } 
}
 // time complexity = o(n^2)
 // sum of A.P 
 //The code contains nested loops where the outer loop runs n times and the inner loop runs i times for each iteration of the outer loop. This results in a time complexity of O(n^2) as the total number of iterations is the sum of the first n natural numbers, which is n*(n+1)/2, which simplifies to O(n^2).