import java.util.*;
public class print_reverse_of_number {
      public static void main(String[] args) {
        int reverse_number = 0; // intializing and declaring the value of reverse_number 
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the digit "); 
        int n = sc.nextInt(); // input of n 
        while(n>0){ // condition is also very important 
            int digit= n%10; // updating digit also 
            reverse_number = (reverse_number*10)+digit; // updating reverse_number 
            n=n/10; //  updating n 
        }
        System.out.println("the reverse of number is: "+reverse_number);
          
      } 
}

// logic of reverse of the number 
// reverse = 0;
// let the number is 10899 
// so the steps are 
// 10899%10=9
// last digit = 9
// reverse = (reverse*10)+last digit= (0*10)+9=9

// 1089%10=9
// last digit = 9
// reverse = (reverse*10)+last digit= (9*10)+9=99

// 108%10=8
// last digit = 8
// reverse = (reverse*10)+last digit= (99*10)+8=998

// 10%10=0
// last digit = 0
// reverse = (reverse*10)+last digit= (998*10)+0=9980

// 1%10=1
// last digit = 1
// reverse = (reverse*10)+last digit= (9980*10)+1=99801
