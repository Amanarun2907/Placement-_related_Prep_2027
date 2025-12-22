
import java.util.*;
public class ternary_operator {
    public static void main(String[] args) {
        // int larger = (5>3)? 5 : 3;
        // System.out.println(larger);
        // String type = (5%2==0)? "even": "odd";
        // System.out.println(type);
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter  the number: ");
        int num = sc.nextInt();
        String result = ((num%2)==0)?"even":"odd"; // result after checking condition is stored in the variable
        System.out.println("the nature of number enter by user is: "+result);
    }
}
// ternary operator 
// variable = condition?statement1(if condition is true):statement2 (if condition is false);
