public class sum_of_first_n_natural_numbers_05 {
    public static int sum_calculate(int n){ // sum of n natural number by recurrsion 
        if(n==1){
            return 1;
        }
        int sum01=sum_calculate(n-1);
        return n+sum01;
    }
    public static void main(String[] args) {
        for(int i = 1 ; i<=6;i++){
            System.out.print(sum_calculate(i)+"  ");
        }
    }
} 

//Unwinding the Stack: When the base case is reached and the return keyword is executed, the function starts returning values back to the previous calls, unwinding the call stack