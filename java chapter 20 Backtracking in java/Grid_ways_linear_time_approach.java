public class Grid_ways_linear_time_approach {
    public static int fac(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static int gridways(int n , int  m)
    {
        int x = fac((n-1)+(m-1));
        int y = fac(n-1)*fac(m-1);
        return x/y;
    }
    public static void main(String[] args) {
        System.out.println("total possible ways: "+gridways(3, 3));
    }
}
// permutation 
//The time complexity of the gridways function is O(n) because it involves calculating the factorial of (n-1)+(m-1) and n-1 and m-1 separately, which are linear operations. The main function calls gridways with fixed values, so the overall time complexity is O(n).
