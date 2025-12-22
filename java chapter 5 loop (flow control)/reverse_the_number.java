import java.util.Scanner;
public class reverse_the_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of number ");
        int n = sc.nextInt(); // user input 
        while(n>0){ // condition 
            int digit = n%10; // last_digit 
        System.out.println(digit);
        n=n/10; // updating number 
        }
        System.out.println("thanks for printing digit of the number ");


    }
}
// if we have to find the last digit of any number then use modulus operator 
// if we have to remove the last digit of any mumber then use (/) operator 
// any number less than 10 when divided by 10 gives answer as 0 (Q value )
// example (dry run)
// n=986

// step 1 : 6
// 986%10=6
// 986/10=98

// step 2:8
// 98%10=8
// 98/10=9

// step 3:9
// 9%10=9
// 9/10=0

// loop stop 