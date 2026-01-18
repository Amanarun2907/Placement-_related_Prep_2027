public class Power_function_2_analysis {
    // public static int power(int a,int n){
    //     if(n==0){
    //         return 1;
    //      }
    //      if(n%2!=0){
    //         return a*power(a, n/2)*power(a,n/2);
            
    //      }
    //      return power(a, n/2)*power(a,n/2);
    // }
    public static int power(int a,int n){
        if(n==0){
            return 1;
         }
         int halfpowerSq= power(a, n/2)*power(a,n/2);
         if(n%2!=0){
            return a*  halfpowerSq;
            
         }
         return  halfpowerSq;
    }
 public static void main(String[] args) {
  System.out.println(power(5, 3)); // 125

 }   
}
// different approach 
// a^n = a^(n/2)*a(n^2) if n is even 
// a^n = a*a^(n/2)*a(n^2) if n is odd
//In summary, the time complexity of the function is O(n), and the space complexity is O(n) due to the recursive calls.