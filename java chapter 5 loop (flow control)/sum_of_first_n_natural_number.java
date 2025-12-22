import java.util.*;
public class sum_of_first_n_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n upto which you have to take the sum of number from 1 ");
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while (num<=n){
            // sum = sum+num;
            sum +=num; 
            num++;
        }
        System.out.println("the sum of number is: "+sum);
        
    }
}
