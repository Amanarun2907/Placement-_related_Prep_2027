public class sum_of_n_numbers {
    public static int sum(int n){
     if(n==0){
        return 0;
     }
     return sum(n-1)+n; // faith step 
    }
    public static void main(String[] args) {
        
    }
}
// sum of first n whole numbers .
// time complexity = O(n)
// space complexity = O(n)
//	The code uses recursion to calculate the sum of n numbers by calling the sum function recursively n times. Each recursive call decrements n by 1 until it reaches 0, so the time complexity is O(n)


