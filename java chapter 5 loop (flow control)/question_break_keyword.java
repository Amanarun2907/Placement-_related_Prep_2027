import java.util.*;
public class question_break_keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // do{
        //     System.out.println("enter your number ");
        //     int n = sc.nextInt();
        //     if(n%10==0)
        //     break;
        //     System.out.println(n);
        // }while(true);
        // System.out.println("you have enter the multiple of 10 so loop stop as we use the break keyword ");
        for (;;){
            System.out.println("enter your number ");
            int n = sc.nextInt();
            if(n%10==0)
            break;
            System.out.println(n);
        }
        System.out.println("you have enter the multiple of 10 so loop stop as we use the break keyword ");
    }
}
// you have to take the user from input from user utill user enter the multiple of n . (Application of break keyword )
