
import java.util.*;
public class marks_fail_pass_ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter  the marks: ");
        int marks = sc.nextInt();
        String result = ((marks)>33)?"pass":"fail"; // result after checking condition is stored in the variable
        System.out.println("the result of the student is : "+result);
    }
}
    

