public class Power_function_1_analysis {
    public static int power(int a , int n){
        if(n==0){
            return 1;
        }
        return a*power(a,n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(5, 3));
    }
}
// calculation of a^n 
// very basic approach 
//linear case 
// work done(time complexity) =  no of calls * time in each call
// time complexity = O(n)
// Space complexity = O(n)
// a^n = a*a^(n-1)
// a^n-1 = a*a^(n-2)
// a^n-2 = a*a^(n-3)
// a^n-3 = a*a^(n-4)
// a^n-4 = a*a^(n-5)
// a^n-5 = a*a^(n-6).................. so on 



// different approach 
// a^n = a^(n/2)*a(n^2) if n is even 
// a^n = a*a^(n/2)*a(n^2) if n is odd 
//The power function recursively calls itself n times, decrementing n by 1 each time until n reaches 0. Therefore, the time complexity is O(n) where n is the exponent value.

