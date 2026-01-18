public class Nested_loop_1_analysis {
   public static void main(String[] args) {
    int n = 10;
       for(int i = 0;i<n;i++){
  for(int j = i+1;j<n;j++){
    System.out.println("("+i+","+j+")");
    //some constant work 
    // is done in this loop 
  }
       }
   } 
}
// nested loop time complexity 
// total operation / total runs   
// sum of A.p = total terms / 2(first term + last term)
// try to find out how many time inner loop is running then sum it up to get final time complexity . 
// time complexity = o(n^2)
//The nested loops iterate from i=0 to n-1 and j=i+1 to n-1, resulting in a total of n*(n-1)/2 iterations, which simplifies to O(n^2)