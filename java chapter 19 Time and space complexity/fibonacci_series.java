public class fibonacci_series {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        // f(n) = f(n-1)+f(n-2) Recurrence relation
        // T(n) = T(n-1)+T(n-2)+k
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        
    }
}
// works on the principle of divide and conquer
// dfa = depth first approach
// using recursive tree (dfs) or we can do by recurrence equation.
// Time complexity = O(2^n)
// space complexity = O(n) 
// master theorem is also used 
// golden ratio in fibonaaci 
// 	The code uses a recursive approach to calculate the Fibonacci series, where each call branches into two more calls. This results in an exponential time complexity of O(2^n) where n is the input number.	


