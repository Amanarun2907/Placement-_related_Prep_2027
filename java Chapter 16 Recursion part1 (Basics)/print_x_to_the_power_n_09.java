


import java.util.*;
public class print_x_to_the_power_n_09 {
    public static int pow_of_x(int x , int n ){
if(n==0){
    return 1;
}
// pow_of_x(int x , int n ) = x*pow(int x, int n-1)
// x^n = x*x^(n-1)
// int aman = pow_of_x(x, n-1);
// int asmita = x*pow_of_x(x,n-1);
// return asmita;
    return x*pow_of_x(x, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        System.out.println("enter the power of x ");
        int z = sc.nextInt();
     System.out.println("the value of x to the power z is : " + pow_of_x(x, z)); // 125
    }
}
// please do its stack analysis 
// time  complexity = o(n)