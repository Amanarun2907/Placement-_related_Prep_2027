public class optimized_print_x_to_the_power_n_10 {
    public static int op_pow_of_x(int a , int n){ // o(logn)
    if(n==0){
        return 1; // base condition 
    }
        // int halfpowersq= op_pow_of_x(a, n/2)*op_pow_of_x(a, n/2); 
        int halfpower = op_pow_of_x(a, n/2);
        int halfpowersq = halfpower*halfpower;
     // if n is odd 
     if(n%2!=0){
        halfpowersq = a*halfpowersq;
     }
    return halfpowersq;
    }
    public static void main(String[] args) {
      System.out.println(op_pow_of_x(5, 3));   
    }
}
// time complexity = o(logn)
// case : x^n = (x)*(x^n-1)
// case 1: if n is even number then x^n = (x^n/2) * (x^n/2)
// case 2 : if n is odd number then x^n = (x)*(x^n/2)*(x^n/2)
