public class factorial_of_a_number {
    public static int  fac(int n){
        if(n==0){
            return 1;
          } 
     return n*fac(n-1);
    }
    public static void main(String[] args) {
     

    }
}
// linear recursion
//Work done = (no of call * work in each call)
// space complexity = max depth * each level memory consumption
// T.C = O(n)
// S.C = O(n) 
//The code uses recursion to calculate the factorial of a number. The recursive function calls itself n times, decrementing n by 1 each time until n reaches 0. Therefore, the time complexity is O(n) where n is the input number.