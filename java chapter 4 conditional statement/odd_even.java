import java.util.*;
public class odd_even{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number");
       int num = sc.nextInt();
       if (num % 2 == 0) {
           System.out.println("number is even ");
       } 
       else{
System.out.println("number is odd ");
       }
    }
}
// 4 is divisible by 2 so it is even 
// 5 is not divisible by 2 so it is odd 