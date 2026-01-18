public class Power_function_3_analysis {
    public static int power(int a,int n){
            if(n==0){
                return 1;
             }
             int halfpower = power(a, n/2);
             int halfpowerSq= halfpower*halfpower;
             if(n%2!=0){
                return a*halfpowerSq;
                
             }
             return halfpowerSq;
        }
    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
//In summary, both the time and space complexity of the function are O(log n). [Optimized code for a to the power n ]
// in power function 1 : Time complexity is O(n). a^n = a*a^(n-1)
// in power function 2 : Time complexity is O(n). a^n = a^(n/2)*a^(n/2) if n is odd otherwise a^(n/2)*a^(n/2)
// in power function 3 : Time complexity is O(logn). int halfpowersq = halfpower*halfpower where halfpower is power(a,n/2)
// for any positive value of x : log(x)<x............
  