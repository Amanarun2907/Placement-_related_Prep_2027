public class Grid_ways_bruteforce_approach {
    public static int gridways(int i , int j , int n , int m )
    {
        if(i==n-1 & j==m-1){
         return 1; // base case  

        }
        else if(i == n || j ==m){
            return 0 ; // boundary cross condition 
        }
        // movement allowed is only right and down direction 
      int w1 = gridways(i+1, j, n, m);// down  direction 
      int w2 = gridways(i, j+1, n, m) ;// right direction 
      return w1+w2; // total ways 
         
    }
    public static void main(String[] args) {
        int n = 3 , m = 3; // no of rows and no of columns 
        System.out.println(gridways(0, 0, n, m)); // function calling 
    } 
}  
//The function recursively explores all possible paths in a grid of size n x m by moving either down or right at each step. At each step, there are two recursive calls, leading to a branching factor of 2. As a result, the time complexity is exponential, specifically O(2^(n+m)).