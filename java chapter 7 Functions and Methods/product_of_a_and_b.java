import java.util.Scanner ;
public class product_of_a_and_b {
    public static int multiply (int a , int b){
        int product = a*b;
        return (product) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first number");
        int a  = sc.nextInt();
        System.out.println("enter first number");
        int b  = sc.nextInt();
        int prod_1  = multiply(a, b);
        System.out.println("final answer after multiply is: "+prod_1);
        int c = 9;
        int d = 10;
        int prod_2 = multiply(c,d); 
        System.out.println("final answer after multiply c with d is: "+prod_2);
    }
}
