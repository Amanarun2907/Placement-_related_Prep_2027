
// Tiling problem 
import java.util.*;
public class Tiling_problem_01{
    public static int tilingProblem(int n){ // 2*n is my floor size 
    // base case
    if(n==0 || n==1){
        return 1;
    }
    // kaam  
    // inner function 
    // vertical chiice 
    int fnm1 = tilingProblem(n-1); // 2*1
    // hirizontal choice 
    int fnm2 = tilingProblem(n-2); // 1*2
    // no of combination possible (total ways)
    int totalWays= fnm1+fnm2;
    return totalWays;
    // inner function  

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the value of n in 2*n");
    int n = sc.nextInt();
    System.out.println("no of total ways possible is: "+tilingProblem(n));
    }
}
//Question : Given a "2*n" board and tiles of size "2*1" , count the number of ways to tile the given board using the 2*1 tiles . (A tiles can either be placed horizontally or vertically)
