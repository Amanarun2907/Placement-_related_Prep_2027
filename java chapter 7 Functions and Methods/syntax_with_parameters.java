import java.util.*;
public class syntax_with_parameters {
    public static int  sum(int a , int b){
        // Scanner sc = new Scanner (System.in);
        // System.out.println("enter first number ");
        // int a = sc.nextInt();
        // System.out.println("enter second  number ");
        // int b = sc.nextInt();
        int sum = a+b;
        // System.out.println("sum equal to: "+sum);
        return sum; // returning the sum value 
    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter second  number ");
        int b = sc.nextInt();
         int final_sum = sum(a,b); // calling the sum function  and store the return value in final_sum 
        System.out.println("the sum of two number is: "+final_sum);
        System.out.println("hence proved !!!! ");
        }
}

// returnType name (type param1 , type parem2){
// body 
// return statement
//}