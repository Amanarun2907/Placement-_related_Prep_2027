import java.util.Scanner;
public class Continue_question {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do { 
        System.out.println("enter the number");
        int num=sc.nextInt(); // user enter the number
        if(num%10==0){
            continue; // if the number is a multiple of 10 then skip that number to print 
        }
        System.out.println("the number entered by you is: "+num);
    } while (true); // condition is always true for any value of variable    
    }
}
// anything below continue keyword will not work for that particular iteration.
// to skip the particular iteration continue keyword is used .
