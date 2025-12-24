public class parameters_vs_arguments {
    public static int multiply(int a , int b){ // here a and b is parameters  or formal parameters 
        return a*b;
    }
    public static void main(String[] args) {
        // input pass during the formation of the function is called parameters or formal parameters .
        // input pass during the function calling is called arguments or actual parameters 
    int final_multiply = multiply(2,10); // here 2 and 10 are arguments or actual parameters  
    System.out.println("the value of multiplication of 2 and 10 is: "+final_multiply);
    // arguments -----> function calling 
    // parameters -----> defination of the function 
    
    }
}
