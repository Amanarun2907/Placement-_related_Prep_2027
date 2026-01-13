public class factorial_of_a_number_04 {
    public static int factorial_numbers(int n){
        if(n==1 || n == 0){
            return 1; // this is our base case 
        }
        return factorial_numbers(n-1)*n; 
        // as return type is integer . 

    }
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            System.out.print(factorial_numbers(i)+"  ");
        }
    }
}  
// time complexity is o(n)
// space complexity is o(n)
// print the factorial of the number from 1 to 10 
// output : 1  2  6  24  120  720  5040  40320  362880  3628800  