import java.util.*;
public class print_no_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number upto which you have to print number starting from 1 ");
        int n = sc.nextInt();
        int number = 1;
        while(number<=n){
            System.out.print(number+" ");
            number++;
        }
        System.out.println(" ");
    }
    
}
// this time we are taking input from user 
