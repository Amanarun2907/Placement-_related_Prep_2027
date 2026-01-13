public class fibonacci_series_06 {
    public static int fib_num(int n ){
        if(n==0||n==1){
            return n;
        }
        //return fib_num(n-1)+fib_num(n-2);
        int aman = fib_num(n-1);
        int asmita = fib_num(n-2);
        int arun = fib_num(n-1)+fib_num(n-2);
  return arun;
    }
    public static void main(String[] args) {
        int a = 7 ;
        // // 5th term of fibonacci series 
        System.out.println(fib_num(a)); 
        // for (int i = 0;i<=8;i++){
        //     System.out.print(fib_num(i)+"  ");
        // } // printing fibonacci number .................
    }
}
// 0th term = 0
// 1st term = 1 .... and so on
// 0 1 1 2 3 5 8 13 21 34.....................
// please do its stack analysis (very important to understand it ).....
// time complexity = O(2^n) why????????????
// space complexity = 0 (n)
// dynamic programming leads to reduction in time complexity to linear ...  (Important)