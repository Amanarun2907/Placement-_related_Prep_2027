import java.util.*;
public class binomial_coefficient {
    public static int factorial(int n){
        int fac =1;
        if (n==0 || n==1){
            return 1;
        }
        else {
            for (int i = 1;i<=n;i++){
                fac *=i;
            }
            return fac;
        }
    }
   public static void main(String[] args) {
    // binomial coefficient 
    //    nCr = n!/(n-r)! r!
    Scanner sc = new Scanner (System.in);
    System.out.println("enter the value of n in nCr ");
    int n = sc.nextInt();
    System.out.println("enter the value of r in nCr ");
    int r = sc.nextInt();
    int n_fac = factorial(n);
    int r_fac = factorial(r);
    int n_r_fac = factorial(n-r);
    int binomial_coefficient = n_fac / (r_fac*n_r_fac);
    System.out.println("value of binomail coeffienct is: "+binomial_coefficient);
    // here factorial become helper function to find binomial coefficient .
   } 
}
