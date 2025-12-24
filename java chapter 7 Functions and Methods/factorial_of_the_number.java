import java.util.*;
public class factorial_of_the_number {
    public static int factorial_1 (int n ){
        int fac = 1;
        if( n==1 || n==0){
            return 1;
        }
          else {
            for (int i = 1 ; i<=n;i++){
                /*  fac = fac*i;*/ fac *=i;
            }
        return fac ; 
        }
    }
    public static void main(String[] args) {
        // factorial of n = n*(n-1)*(n-2)........1
        // 0! = 1 , 1! = 1 , 2! = 2 ,3! =6 , 4! = 24 ....
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        // int fac = factorial_1(n); // function calling 
        System.out.println("The factorial of the number is equal to: "+factorial_1(n));
    }
}
